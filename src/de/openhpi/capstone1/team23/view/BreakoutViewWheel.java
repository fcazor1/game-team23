package de.openhpi.capstone1.team23.view;

import de.openhpi.capstone1.team23.model.Breakout;
import processing.core.PApplet;

public class BreakoutViewWheel extends AbstractBreakoutView {
			
	public BreakoutViewWheel(PApplet display, Breakout counter) {
		super(display, counter);
		counter.setWheelXpos(display.width/2);
		counter.setWheelYpos(display.height/2);
	}
	
	@Override
	public void update() {
		
		// Update the position of the wheel
		float xpos = counter.getWheelXpos();
		float ypos = counter.getWheelYpos();
		int xdirection = counter.getXdirection();
		int ydirection = counter.getYdirection();
		int rad = counter.getRad();
		xpos = xpos + ( counter.getXspeed() * xdirection );
		ypos = ypos + ( counter.getYspeed() * ydirection );
		counter.setWheelXpos(xpos);
		counter.setWheelYpos(ypos);
		
		// Test to see if the shape exceeds the boundaries of the screen
		// If it does, reverse its direction by multiplying by -1
		if (xpos > display.width-rad || xpos < rad) {
		    xdirection *= -1;
		    counter.setXdirection(xdirection);
		}
		if (ypos > display.height-rad || ypos < rad) {
		    ydirection *= -1;
		    counter.setYdirection(ydirection);
		}
		  
		// Draw the shape
		display.ellipse(xpos, ypos, rad, rad); 
		  
		display.fill(0);
		display.textSize(32);
		display.text(counter.getCount() + "", 10, 30);
		display.fill(255);
	}
}
