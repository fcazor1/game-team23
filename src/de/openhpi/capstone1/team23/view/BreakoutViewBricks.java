package de.openhpi.capstone1.team23.view;

import de.openhpi.capstone1.team23.model.Counter;
import processing.core.PApplet;

public class BreakoutViewBricks extends AbstractBreakoutView {
	
	public BreakoutViewBricks(PApplet display, Counter counter) {
		super(display, counter);
	}
	
	public void update() {
		try {
			int[] colors = new int[3];
			
			int v = 40; //counter.getCount();
			
			colors[0] = (v * 10) % 255;
			colors[1] = (v * 5) % 255;
			colors[2] = (v * 20) % 255;
			
			display.fill(colors[0], colors[1], colors[2]);
			display.rect(1, 1, 30, 20);
			display.rect(30, 1, 30, 20);
			display.rect(60, 1, 30, 20);
			display.rect(90, 1, 30, 20);
			display.rect(120, 1, 30, 20);
			display.rect(150, 1, 30, 20);
			display.rect(180, 1, 30, 20);
			display.rect(210, 1, 30, 20);
			display.rect(240, 1, 30, 20);
			display.rect(270, 1, 30, 20);
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}
	}
}
