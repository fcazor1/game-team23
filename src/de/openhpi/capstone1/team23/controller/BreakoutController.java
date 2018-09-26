package de.openhpi.capstone1.team23.controller;

import de.openhpi.capstone1.team23.model.Breakout;

public class BreakoutController implements Controller {

	Breakout counter;
	
	public BreakoutController(Breakout counter) { 
		this.counter = counter;
	}
	
	public void handleEvent() {
		counter.updateCount(1);
	}

	public void handleEvent2(int key) {
		if (key==-1||key==+1)
			counter.updatePaddle(key);
		else if (key==0)
			counter.newBall();
	}
}
