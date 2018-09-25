package de.openhpi.capstone1.team23.model;

public class Breakout {

	private int count = 0;
	private int[][] bricks = new int[2][10];
	
	public Breakout(){
		for( int i=0; i<2; i++)
			for (int j=0; j<10; j++)
				bricks[i][j] = 1;
	}

	public void updateCount(int value) {
		this.count += value;
	}
	
	public int getCount() {
		return this.count;
	}
}
