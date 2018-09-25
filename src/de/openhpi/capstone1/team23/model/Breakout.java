package de.openhpi.capstone1.team23.model;

import processing.event.KeyEvent;

public class Breakout {

	private int count = 0;
	private int filas = 2;
	private int columnas = 10;
	private int[][] bricks = new int[filas][columnas];
	private int paddlexpos = 0;
	private int MaxPaddleXpos = 270;
	
	int rad = 5;        // Width of the shape
	private float xpos, ypos;    // Starting position of shape 
	float xspeed = 2.8f;  // Speed of the shape
	float yspeed = 2.2f;  // Speed of the shape
	int xdirection = 1;  // Left or Right
	int ydirection = 1;  // Top to Bottom

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
}
