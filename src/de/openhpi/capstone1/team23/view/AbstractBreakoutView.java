package de.openhpi.capstone1.team23.view;

import de.openhpi.capstone1.team23.model.Bricks;
import de.openhpi.capstone1.team23.model.Paddle;
import de.openhpi.capstone1.team23.model.Wheel;
import processing.core.PApplet;

public abstract class AbstractBreakoutView extends AbstractView {

	protected Paddle paddle;
	protected Wheel wheel;
	protected Bricks bricks;
	
	public AbstractBreakoutView(PApplet display, Paddle paddle, Wheel wheel, Bricks bricks) {
		super(display);
		this.paddle = paddle;
		this.wheel = wheel;
		this.bricks = bricks;
	}
	
}
