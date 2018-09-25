package de.openhpi.capstone1.team23.controller;

import de.openhpi.capstone1.team23.model.Breakout;

public class BreakoutController2 implements Controller{

	Breakout counter;
	
	public BreakoutController2(Breakout counter) {
		this.counter = counter;
	}
	
	@Override
	public void handleEvent() {
		counter.updateCount(30);
	}

	@Override
	public void handleEvent2(int key) {
		// TODO Auto-generated method stub
		
	}
}
