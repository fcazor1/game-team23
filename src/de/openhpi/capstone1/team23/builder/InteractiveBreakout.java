package de.openhpi.capstone1.team23.builder;

import de.openhpi.capstone1.team23.controller.BreakoutControllerStrategy;
import de.openhpi.capstone1.team23.model.Bricks;
import de.openhpi.capstone1.team23.view.AbstractView;
import de.openhpi.capstone1.team23.view.BreakoutViewBricks;
import de.openhpi.capstone1.team23.view.BreakoutViewPaddle;
import de.openhpi.capstone1.team23.view.CounterViewColor;
import de.openhpi.capstone1.team23.view.CounterViewMove;
import de.openhpi.capstone1.team23.view.CounterViewNumber;
import processing.core.PApplet;


public class InteractiveBreakout extends InteractiveComponent {
	BreakoutControllerStrategy breakoutControllerStrategy;
	Bricks counter;

	public InteractiveBreakout() {}
	
	public void addModel() {
		counter = new Bricks();
	}
	
	public void createViews(PApplet applet) {
		views = new AbstractView[3];
		views[0] = new BreakoutViewBricks(applet, counter);
		views[1] = new BreakoutViewPaddle(applet, counter);
		views[2] = new BreakoutViewWheel(applet, counter);
	}
	
	public void addController() {
		breakoutControllerStrategy = new BreakoutControllerStrategy(counter);
	}
	
	@Override
	public void handleEvent() {
		breakoutControllerStrategy.handleEvent();
	}

}
