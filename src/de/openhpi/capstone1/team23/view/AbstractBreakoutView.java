package de.openhpi.capstone1.team23.view;

import de.openhpi.capstone1.team23.model.Breakout;
import processing.core.PApplet;

public abstract class AbstractBreakoutView extends AbstractView {

	protected Breakout counter;

	public AbstractBreakoutView(PApplet display, Breakout counter) {
		super(display);
		this.counter = counter;
	}

}