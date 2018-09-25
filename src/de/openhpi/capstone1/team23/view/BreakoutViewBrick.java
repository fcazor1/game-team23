package de.openhpi.capstone1.team23.view;

import de.openhpi.capstone1.team23.model.Breakout;
import processing.core.PApplet;

public class BreakoutViewBrick extends AbstractBreakoutView {
	
	public BreakoutViewBrick(PApplet display, Breakout counter) {
		super(display, counter);
	}
	
	public void update() {
		try {
			
			int[][] x = counter.getBricks();
			
			int[] colors = new int[3];
			
			int v = 30;
			
			colors[0] = (v * 10) % 255;
			colors[1] = (v * 5) % 255;
			colors[2] = (v * 20) % 255;
			display.fill(colors[0], colors[1], colors[2]);
			
			int ypos;
			int xpos;
			for(int i=0;i<counter.getFilas();i++){
				for(int j=0;j<counter.getColumnas();j++){
					if(x[i][j]==1){
						ypos = 1+j*30;
						xpos = 1+i*20;
						display.rect(ypos, xpos, 30, 20);
					}
				}
			}
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}
	}
}
