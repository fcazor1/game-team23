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
		int b;
		float yMin = counter.getYboundaryOver(xpos, ypos-rad-2f);
		if(ypos-rad-2f<counter.getFilas()*20+1)
		if (ypos-rad<=yMin+8){
			b = counter.getBrick(xpos, ypos-rad-2f);
			if(b>0){
				xpos = xpos + ( counter.getXspeed() * xdirection );
				ypos = ypos + ( counter.getYspeed() * ydirection );
				counter.setWheelXpos(xpos);
				counter.setWheelYpos(ypos);
				xdirection *= -1;
			    counter.setXdirection(xdirection);
			}
		}
		if (ypos<393){
			xpos = xpos + ( counter.getXspeed() * xdirection );
			ypos = ypos + ( counter.getYspeed() * ydirection );
			counter.setWheelXpos(xpos);
			counter.setWheelYpos(ypos);
		}else{
			//counter.updateCount(-1);
		}
		
		// Test to see if the shape exceeds the boundaries of the screen
		// If it does, reverse its direction by multiplying by -1
		if (xpos > display.width-rad || xpos < rad ) {
		    xdirection *= -1;
		    counter.setXdirection(xdirection);
		}
			
		int x = counter.getPaddleXpos();
		if (ypos>360)
			if (xpos > x && xpos < x+30){
				ydirection *= -1;
				counter.setYdirection(ydirection);
			}
				
		if (ypos > display.height-rad || ypos < rad ) { // || ypos < counter.getFilas()*20+5 ) {
		    ydirection *= -1;
		    counter.setYdirection(ydirection);
		}
		// Draw the shape
		display.fill(255);
		display.ellipse(xpos, ypos, rad, rad);		
		  
		display.fill(0);
		display.textSize(12);
		if(yMin>0)
		display.text(yMin, 10, 30);
	}
}
