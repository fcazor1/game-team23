package de.openhpi.capstone1.team23.model;

public class Bricks {
	
	private int count = 0;

	public void updateBricks(int value) {
		this.count += value;
	}
	
	public int getCount() {
		return this.count;
	}

}
