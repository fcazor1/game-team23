package de.openhpi.capstone1.team23.controller;

import de.openhpi.capstone1.team23.model.Breakout;

public class BreakoutControllerStrategy {
	private Controller counterController1;
	private Controller counterController2;
	private boolean largeStep = false;
	
	public BreakoutControllerStrategy(Breakout counter) {
		this.counterController1 = new BreakoutController(counter);
		this.counterController2 = new BreakoutController2(counter);
	}
	
	public void handleEvent() {
		if (largeStep == true) {
			counterController1.handleEvent();
			largeStep = false;
		} else {
			counterController2.handleEvent();
			largeStep = true;
		}
	}
	

}
