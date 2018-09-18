package de.openhpi.capstone1.team23.builder;

import de.openhpi.capstone1.team23.controller.CounterControllerStrategy;
import de.openhpi.capstone1.team23.model.Counter;
import de.openhpi.capstone1.team23.view.AbstractView;
import de.openhpi.capstone1.team23.view.CounterViewColor;
import de.openhpi.capstone1.team23.view.CounterViewMove;
import de.openhpi.capstone1.team23.view.CounterViewNumber;
import processing.core.PApplet;

public class InteractiveCounter extends InteractiveComponent {
	CounterControllerStrategy counterControllerStrategy;
	Counter counter;
	
	public InteractiveCounter() {}
	
	public void addModel() {
		counter = new Counter();
	}
	
	public void createViews(PApplet applet) {
		views = new AbstractView[3];
		views[0] = new CounterViewMove(applet, counter);
		views[1] = new CounterViewColor(applet, counter);
		views[2] = new CounterViewNumber(applet, counter);
	}
	
	public void addController() {
		counterControllerStrategy = new CounterControllerStrategy(counter);
	}
	
	@Override
	public void handleEvent() {
		counterControllerStrategy.handleEvent();
	}
}
