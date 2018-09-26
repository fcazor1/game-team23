package de.openhpi.capstone1.team23.view;

import de.openhpi.capstone1.team23.model.Breakout;
import processing.core.PApplet;

public class BreakoutViewPaddle extends AbstractBreakoutView { 
		
	public BreakoutViewPaddle(PApplet display, Breakout counter) {
		super(display, counter);
	}
	
	public void update() {
		try {
			int x = counter.getPaddleXpos();
			int y = counter.getPaddleVerticalPos();
			int w = counter.getPaddleWidth();
			int h = counter.getPaddleHigh();
			display.fill(0);
			display.rect(x, y, w, h);
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}
	}
}
