package de.openhpi.capstone1.team23.builder;

import processing.core.PApplet;

public interface Builder {
	public void buildComponent();
	public void buildModel(); 
	public void buildView(PApplet applet);
	public void buildController();
	
	public InteractiveComponent getComponent();
}
