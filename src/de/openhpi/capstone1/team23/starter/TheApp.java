package de.openhpi.capstone1.team23.starter;


import de.openhpi.capstone1.team23.builder.GUIComponent;
import de.openhpi.capstone1.team23.builder.InteractiveComponent;
import de.openhpi.capstone1.team23.builder.InteractiveBreakoutBuilder;
import processing.core.PApplet;

public class TheApp extends PApplet {

	InteractiveComponent interactiveBreakout;

	@Override
	public void settings() {
		size(300, 400);
	}

	@Override
	public void setup() {  // setup() runs once
		frameRate(20);
		ellipseMode(RADIUS);
		InteractiveBreakoutBuilder builder = new InteractiveBreakoutBuilder();
		GUIComponent.construct(this, builder);
		interactiveBreakout = builder.getComponent();
	}

	@Override
	public void draw() {  // draw() loops forever, until stopped
		background(204);
		fill(255);
		interactiveBreakout.update();
	}
	
	@Override
	public void mouseClicked() {
		interactiveBreakout.handleEvent();
	}
	
	@Override
	public void keyPressed() {
		if (keyCode == LEFT)
        interactiveBreakout.handleEvent2(-1);
		if (keyCode == RIGHT)
			interactiveBreakout.handleEvent2(+1);
		if (keyCode == ' ')
			interactiveBreakout.handleEvent2(0);
    }
}
