package de.openhpi.capstone1.team23.controller;

import de.openhpi.capstone1.team23.model.Bricks;

public class BreakoutController implements Controller {

	Bricks counter;
	
	public BreakoutController(Bricks counter) { 
		this.counter = counter;
	}
	
	public void handleEvent() {
		counter.updateBricks(5);
	}
}
