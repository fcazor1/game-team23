package de.openhpi.capstone1.team23.builder;

import de.openhpi.capstone1.team23.controller.BreakoutControllerStrategy;
import de.openhpi.capstone1.team23.model.Bricks;
import de.openhpi.capstone1.team23.model.Paddle;
import de.openhpi.capstone1.team23.model.Wheel;
import de.openhpi.capstone1.team23.view.AbstractView;
import de.openhpi.capstone1.team23.view.BreakoutViewBricks;
import de.openhpi.capstone1.team23.view.BreakoutViewPaddle;
import de.openhpi.capstone1.team23.view.BreakoutViewWheel;
//import de.openhpi.capstone1.team23.view.CounterViewColor;
//import de.openhpi.capstone1.team23.view.CounterViewMove;
//import de.openhpi.capstone1.team23.view.CounterViewNumber;
import processing.core.PApplet;


public class InteractiveBreakout extends InteractiveComponent {
	BreakoutControllerStrategy breakoutControllerStrategy;
	Bricks bricks;
	Wheel wheel;
	Paddle paddle;

	public InteractiveBreakout() {}
	
	public void addModel() {
		bricks = new Bricks();
		wheel = new Wheel();
		paddle = new Paddle();
	}
	
	public void createViews(PApplet applet) {
		views = new AbstractView[3];
		views[0] = new BreakoutViewBricks(applet, bricks);
		views[1] = new BreakoutViewPaddle(applet, paddle);
		views[2] = new BreakoutViewWheel(applet, wheel);
	}
	
	public void addController() {
		breakoutControllerStrategy = new BreakoutControllerStrategy(counter);
	}
	
	@Override
	public void handleEvent() {
		breakoutControllerStrategy.handleEvent();
	}

}
