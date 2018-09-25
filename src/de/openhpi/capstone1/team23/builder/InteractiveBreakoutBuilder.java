package de.openhpi.capstone1.team23.builder;

import processing.core.PApplet;

public class InteractiveBreakoutBuilder implements Builder {

	InteractiveBreakout iCounter;
	
	@Override
	public void buildComponent() {
		iCounter = new InteractiveBreakout();
	}

	@Override
	public void buildModel() {
		iCounter.addModel();
	}

	@Override
	public void buildView(PApplet applet) {
		iCounter.createViews(applet);
	}

	@Override
	public void buildController() {
		iCounter.addController();
	}

	@Override
	public InteractiveComponent getComponent() {
		return iCounter;
	}

}
