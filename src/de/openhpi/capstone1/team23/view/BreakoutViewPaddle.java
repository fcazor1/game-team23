package de.openhpi.capstone1.team23.view;

import de.openhpi.capstone1.team23.model.Paddle;
import processing.core.PApplet;

public class BreakoutViewPaddle extends AbstractBreakoutView {
	public BreakoutViewPaddle(PApplet display, Paddle paddle) {
		super(display, paddle);
	}
	public void update() {
		try {
			int x = counter.getCount();
			display.fill(0);
			display.rect(x, 370, 30, 10);
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}
	}
}
