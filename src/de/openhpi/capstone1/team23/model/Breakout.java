package de.openhpi.capstone1.team23.model;

import processing.event.KeyEvent;

public class Breakout {

	private int count = 0;
	private int filas = 2;
	private int columnas = 10;
	private int[][] bricks = new int[filas][columnas];
	private int paddlexpos = 0;
	private int MaxPaddleXpos = 270;
	
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
}
