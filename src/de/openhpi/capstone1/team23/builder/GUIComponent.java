package de.openhpi.capstone1.team23.builder;

import processing.core.PApplet;

public class GUIComponent {
	private GUIComponent() {}
	
	public static void construct(PApplet applet, Builder builder) {
		builder.buildComponent();
		builder.buildModel();
		builder.buildView(applet);
		builder.buildController();
	}
}
