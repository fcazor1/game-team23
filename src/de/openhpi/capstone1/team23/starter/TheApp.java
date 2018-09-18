package de.openhpi.capstone1.team23.starter;


import de.openhpi.capstone1.team23.builder.GUIComponent;
import de.openhpi.capstone1.team23.builder.InteractiveComponent;
import de.openhpi.capstone1.team23.builder.InteractiveCounterBuilder;
import processing.core.PApplet;

public class TheApp extends PApplet {

	InteractiveComponent interactiveCounter;

	@Override
	public void settings() {
		size(300, 400);
	}

	@Override
	public void setup() {  // setup() runs once
		frameRate(30);
		InteractiveCounterBuilder builder = new InteractiveCounterBuilder();
		GUIComponent.construct(this, builder);
		interactiveCounter = builder.getComponent();
	}

	@Override
	public void draw() {  // draw() loops forever, until stopped
		background(204);
		fill(255);
		rect(random(100),random(100), 10, 10);
		interactiveCounter.update();
	}
	
	@Override
	public void mouseClicked() {
		interactiveCounter.handleEvent();
	}
}
