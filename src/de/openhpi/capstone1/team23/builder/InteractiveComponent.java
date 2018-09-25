package de.openhpi.capstone1.team23.builder;

import de.openhpi.capstone1.counter.view.AbstractView;

public abstract class InteractiveComponent {
	public abstract void handleEvent();
	protected AbstractView[] views; 
	
	public void update() {
		for (AbstractView view : views) {
			view.update(); 
		}
	}
}
