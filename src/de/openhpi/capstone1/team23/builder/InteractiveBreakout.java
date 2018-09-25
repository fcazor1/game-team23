package de.openhpi.capstone1.team23.builder;

import de.openhpi.capstone1.team23.controller.BreakoutControllerStrategy;
import de.openhpi.capstone1.team23.model.Breakout;
import de.openhpi.capstone1.team23.view.AbstractView;
import de.openhpi.capstone1.team23.view.BreakoutViewBrick;
import de.openhpi.capstone1.team23.view.BreakoutViewWheel;
import de.openhpi.capstone1.team23.view.BreakoutViewPaddle;
import processing.core.PApplet;

public class InteractiveBreakout extends InteractiveComponent {
	BreakoutControllerStrategy breakoutControllerStrategy;
	Breakout counter;
	
	public InteractiveBreakout() {}
	
	public void addModel() {
		counter = new Breakout();
	}
	
	public void createViews(PApplet applet) {
		views = new AbstractView[3];
		views[0] = new BreakoutViewBrick(applet, counter);
		views[1] = new BreakoutViewWheel(applet, counter);
		views[2] = new BreakoutViewPaddle(applet, counter);
	}
	
	public void addController() {
		breakoutControllerStrategy = new BreakoutControllerStrategy(counter);
	}
	
	@Override
	public void handleEvent() {
		breakoutControllerStrategy.handleEvent();
	}
}
