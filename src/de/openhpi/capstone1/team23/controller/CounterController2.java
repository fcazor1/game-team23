package de.openhpi.capstone1.team23.controller;

import de.openhpi.capstone1.team23.model.Counter;

public class CounterController2 implements Controller{

	Counter counter;
	
	public CounterController2(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void handleEvent() {
		counter.updateCount(30);
	}
}
