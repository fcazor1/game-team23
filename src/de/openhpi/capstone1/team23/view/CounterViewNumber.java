package de.openhpi.capstone1.team23.view;

import de.openhpi.capstone1.team23.model.Counter;
import processing.core.PApplet;

public class CounterViewNumber extends AbstractCounterView {
			
	public CounterViewNumber(PApplet display, Counter counter) {
		super(display, counter);
	}
	
	@Override
	public void update() {
		display.fill(0);
		display.textSize(32);
		display.text(counter.getCount() + "", 10, 30);
	}
}