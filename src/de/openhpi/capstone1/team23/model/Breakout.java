package de.openhpi.capstone1.team23.model;

public class Breakout {

	private int count = 0;
	private int filas = 4; // Number of rows of bricks
	private int columnas = 10; // Number of columns of bricks
	private int[][] bricks = new int[filas][columnas]; // Array of bricks
	private int MaxPaddleXpos = 270; // Max horizontal movement of left edge of paddle 
	private int VerticalPaddlePos = 370; // Fixed vertical position of paddle
	private int paddlexpos = MaxPaddleXpos/2; // Horizontal position of center point of paddle
	private int paddleWidth = 30; // Paddle width
	private int paddleHigh = 10; // Paddle high
	private int ballsRemaining = 3; // number of initial balls in the game
	
	int rad = 3;        // Width of the wheel
	private float xpos, ypos;    // Starting position of wheel 
	float xspeed = 2.8f;  // Speed of the wheel
	float yspeed = 2.2f;  // Speed of the wheel
	int xdirection = 1;  // Left or Right
	int ydirection = 1;  // Top to Bottom
	
	boolean newBallEvent = false;
	boolean gameOver = false;

	public Breakout(){
		for( int i=0; i<filas; i++)
			for (int j=0; j<columnas; j++)
				bricks[i][j] = 1;
	}

	public void updateCount(int value) {
		this.count += value;
	}
	
	public void updatePaddle(int key) {

        paddlexpos = paddlexpos + key*20;
        if (paddlexpos<0)
        	paddlexpos = 0;
        if (paddlexpos>MaxPaddleXpos)
        	paddlexpos = MaxPaddleXpos;
	}
	public void newBall(){
		newBallEvent = true;
	}
	public boolean isNewBallEvent(){
		return newBallEvent;
	}
	public void setStartNewBallMove(){
		newBallEvent = false;
	}
	public int getCount() {
		return this.count;
	}
	public int[][] getBricks() {
		return this.bricks;
	}
	public int getFilas(){
		return filas;
	}
	public int getColumnas(){
		return columnas;
	}
	public int getPaddleXpos(){
		return paddlexpos;
	}
	public float getWheelXpos(){
		return xpos;
	}
	public float getWheelYpos(){
		return ypos;
	}
	public void setWheelXpos(float x){
		xpos = x;
	}
	public void setWheelYpos(float y){
		ypos = y;
	}
	public float getXspeed(){
		return xspeed;
	}
	public float getYspeed(){
		return yspeed;
	}
	public int getXdirection(){
		return xdirection;
	}
	public int getYdirection(){
		return ydirection;
	}
	public int getRad(){
		return rad;
	}
	public void setXdirection(int xdir){
		xdirection = xdir;
	}
	public void setYdirection(int ydir){
		ydirection = ydir;
	}
	public int getBrick(float x, float y){
		for( int i=filas-1; i>-1; i--)
			for (int j=0; j<columnas; j++){
				float n = 1f+j*30f;
				float m = 1f+i*20f;
		        if(x > 270f && x < 301f && y > 60f && y < 81f)
		        	return -1;
				if( x > n && x < (n + 30f) && y > m && y < (m + 20f)){
					if(bricks[i][j] == 1){
						bricks[i][j] = 0;
						return j;
					} else
						return 0;
				}
			}
		return 0;
	}
	public float getYboundaryOver(float x, float y){
		float yover = 0;
		if (y<=filas*20+1){
			for( int i=filas-1; i>-1; i--)
				for (int j=0; j<columnas-1; j++){
					int n = 1+j*30;
					if(bricks[i][j] == 1 && x > n && x < (n + 30f)){
						yover = 1f+(i+1)*20f;
						return yover;
					}
				}
		}	
		return yover;
	}
	public int getPaddleVerticalPos(){
		return VerticalPaddlePos;
	}
	public int getPaddleWidth(){
		return paddleWidth;
	}
	public int getPaddleHigh(){
		return paddleHigh;
	}
	public void consumeBall(){
		ballsRemaining -= 1;
	}
	public int getBallsRemaining(){
		return ballsRemaining;
	}
	public void setGameOver(){
		gameOver = true;
	}
	public boolean isGameOver(){
		return gameOver;
	}
}
