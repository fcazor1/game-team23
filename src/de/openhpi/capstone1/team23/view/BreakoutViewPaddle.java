package de.openhpi.capstone1.team23.view;

import de.openhpi.capstone1.team23.model.Breakout;
import processing.core.PApplet;

public class BreakoutViewPaddle extends AbstractBreakoutView {
			
	public BreakoutViewPaddle(PApplet display, Breakout counter) {
		super(display, counter);
	}
	
	@Override
	public void update() {
		display.fill(0);
		display.textSize(32);
		display.text(counter.getCount() + "", 10, 30);
	}
}
