package de.openhpi.capstone1.team23.view;

import processing.core.PApplet;

public abstract class AbstractView {
	protected PApplet display;
	
	public AbstractView(PApplet display) {
		this.display = display;
	}
	
	public abstract void update();
}
