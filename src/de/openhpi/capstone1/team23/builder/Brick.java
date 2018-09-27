package de.openhpi.capstone1.team23.builder;

public class Brick {
	private int row = 0;
	private int col = 0;
	private float xLeftUpperPos = 0f;
	private float yLeftUpperPos = 0f;
	private float xRightLowerPos = 0f;
	private float yRightLowerPos = 0f;
	private int status = 1; // initially not hit
	private int numBricks = 0;
	
	public Brick (int r, int c, float xl, float yl, float xr, float yr, int s){
		row = r;
		col = c;
		xLeftUpperPos = xl;
		yLeftUpperPos = yl;
		xRightLowerPos = xr;
		yRightLowerPos = yr;
		status = s;
		numBricks++;
	}
	
	public float getLeftPosX(int r, int c){
		return xLeftUpperPos;
	}
	public float getLeftPosY(int r, int c){
		return yLeftUpperPos;
	}
	public float getRightPosX(int r, int c){
		return xRightLowerPos;
	}
	public float getRightPosY(int r, int c){
		return this.yRightLowerPos;
	}
	public int getStatus(int r, int c){
		return status;
	}
	public void setStatus(int r, int c, int s){
		status = s;
		if (s==0)
			numBricks--;
	}
	public int getRemainingBricks(){
		return numBricks;
	}
}
