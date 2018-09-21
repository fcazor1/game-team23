package de.openhpi.capstone1.team23.model;

public class Bricks {
	
	private int count = 0;
	private int rows = 3;
	private int cols = 10;
	int [][]bricks = new int[rows][cols];
	
	public Bricks(){
		for(int fila = 0 ; fila < rows ; fila++ ){
		    for(int columna = 0 ; cols < 2 ; columna++ ){
		    	bricks[fila][columna] = 1;
		    }
		}
	}

	public void updateBricks(int row, int col) {
		this.bricks[row][col] = 0;
	}
	
	public int getCount() {
		return this.count;
	}

}
