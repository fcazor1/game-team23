package de.openhpi.capstone1.team23.model;

public class Breakout {

	private int count = 0;
	private int filas = 2;
	private int columnas = 10;
	private int[][] bricks = new int[filas][columnas];
	
	public Breakout(){
		for( int i=0; i<filas; i++)
			for (int j=0; j<columnas; j++)
				bricks[i][j] = 1;
	}

	public void updateCount(int value) {
		this.count += value;
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
}
