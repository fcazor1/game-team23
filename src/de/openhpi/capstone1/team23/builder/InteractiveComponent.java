package de.openhpi.capstone1.team23.builder;

import de.openhpi.capstone1.team23.view.AbstractView;

public abstract class InteractiveComponent {
	public abstract void handleEvent();
	public abstract void handleEvent2(int key);
	protected AbstractView[] views; 
	
	public void update() {
		for (AbstractView view : views) {
			view.update(); 
		}
	}
}
