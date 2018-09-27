package de.openhpi.capstone1.team23.model;

import java.util.ArrayList;
import java.util.List;

import de.openhpi.capstone1.team23.builder.Brick;

public class Breakout {

	private int count = 0;
	private int filas = 4; // Number of rows of bricks
	private int columnas = 10; // Number of columns of bricks
	private List<Brick> bricks = new ArrayList<>(); // Array of bricks
	private int MaxPaddleXpos = 270; // Max horizontal movement of left edge of paddle 
	private int VerticalPaddlePos = 370; // Fixed vertical position of paddle
	private int paddlexpos = MaxPaddleXpos/2; // Horizontal position of center point of paddle
	private int paddleWidth = 36; // Paddle width
	private int paddleHigh = 10; // Paddle high
	private int ballsRemaining = 3; // number of initial balls in the game
	
	int rad = 3;        // Width of the wheel
	private float xpos, ypos;    // Starting position of wheel 
	float xspeed = 2.8f;  // Speed of the wheel
	float yspeed = 2.2f;  // Speed of the wheel
	float xdirection = 1f;  // Left or Right
	float ydirection = 1f;  // Top to Bottom
	
	boolean newBallEvent = false;
	boolean gameOver = false;
	boolean gameWin = false;

	public Breakout(){
		for( int i=0; i<filas; i++)
			for (int j=0; j<columnas; j++){
				float ypos = 1+i*20;
				float xpos = 1+j*30;
				bricks.add(new Brick(i,j,xpos,ypos,xpos+30f,ypos+20f,1));
			}
	}

	public void updateCount(int value) {
		this.count += value;
	}
	
	public void updatePaddle(int key) {

        paddlexpos = paddlexpos + key*10;
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
		xdirection = 1f;  // Left or Right
		ydirection = 1f;  // Top to Bottom
		newBallEvent = false;
	}
	public int getCount() {
		return this.count;
	}
	public List<Brick> getBricks() {
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
	public void setXspeed(float xs){
		xspeed = xs;
	}
	public float getYspeed(){
		return yspeed;
	}
	public float getXdirection(){
		return xdirection;
	}
	public float getYdirection(){
		return ydirection;
	}
	public int getRad(){
		return rad;
	}
	public void setXdirection(float xdir){
		xdirection = xdir;
	}
	public void setYdirection(float ydir){
		ydirection = ydir;
	}
	public int getBrick(float x, float y){
		for( int i=0; i<filas; i++)
			for (int j=0; j<columnas; j++)
				for(int ii=0;ii<this.bricks.size();ii++){
					if(this.bricks.get(ii).getStatus(i, j) == 1){
						if( x > this.bricks.get(ii).getLeftPosX(i, j) && x < this.bricks.get(ii).getRightPosX(i, j) && y > this.bricks.get(ii).getLeftPosY(i, j) && y < this.bricks.get(ii).getRightPosY(i, j)){
							this.bricks.get(ii).setStatus(i, j, 0);
							return j;
						}
					}
				}
		return 0;
	}
	
	public float getYboundaryOver(float x, float y){
		float yover = 0;
		
		if(y<getFilas()*20+1)
		if (y<=filas*20+1){
			for( int i=filas-1; i>-1; i--)
				for (int j=0; j<columnas-1; j++){
					for(int ii=0;ii<this.bricks.size();ii++){
						float xl = this.bricks.get(ii).getLeftPosX(i, j);
						float xr = this.bricks.get(ii).getRightPosX(i, j);
						int s = this.bricks.get(ii).getStatus(i, j);
						if(s == 1 && x > xl && x < xr){
							yover = 1+i*20;//this.bricks.get(ii).getRightPosY(i, j);
							return yover;
						}
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
	public void setGameWin(){
		gameWin = true;
	}
	public boolean isGameOver(){
		return gameOver;
	}
	public boolean isGameWin(){
		return gameWin;
	}
	public int getNumBricks(){
		int numRem = 0;
		for(int ii=0;ii<this.bricks.size();ii++)
			if (this.bricks.get(ii).getStatus(0, 0)==1)
				numRem++;
		return numRem;
	}
}
