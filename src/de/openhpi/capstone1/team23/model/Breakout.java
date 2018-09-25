package de.openhpi.capstone1.team23.model;

public class Breakout {

	private int count = 0;

	public void updateCount(int value) {
		this.count += value;
	}
	
	public int getCount() {
		return this.count;
	}
}
