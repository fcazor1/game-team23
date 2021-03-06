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
		
		if (counter.isGameWin()){
			display.noStroke();
			display.fill(204);
			display.rect(25, 180, 240, 55, 0);
			display.stroke(0);
			display.fill(255,0,0);
			display.textSize(12);
			display.text("You win!", 110, 200);
			return;
		}
		if (counter.isGameOver()){
			display.noStroke();
			display.fill(204);
			display.rect(25, 180, 240, 55, 0);
			display.stroke(0);
			display.fill(255,0,0);
			display.textSize(12);
			display.text("Game over!", 110, 200);
			counter.setGameOver();
			return;
		}
		// Update the position of the wheel
		float xpos = counter.getWheelXpos();
		float ypos = counter.getWheelYpos();
		float xdirection = counter.getXdirection();
		float ydirection = counter.getYdirection();
		int rad = counter.getRad();
		float yMin = counter.getYboundaryOver(xpos, ypos); //-rad-2f);
		int b;
		if(ypos<counter.getFilas()*20+1)
			if (ypos-rad<=yMin+8){
				b = counter.getBrick(xpos+rad, ypos-rad);
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
		}
		
		// Test to see if the shape exceeds the boundaries of the screen
		// If it does, reverse its direction by multiplying by -1
		if (xpos > display.width-rad || xpos < rad ) {
		    xdirection *= -1;
		    counter.setXdirection(xdirection);
		}
			
		int x = counter.getPaddleXpos();
		int w = counter.getPaddleWidth();
		int h = counter.getPaddleVerticalPos();
		int g = counter.getPaddleHigh();
		if (ypos>(h-0.7f))
			if (xpos > x && xpos < x+w){
				ydirection *= -1;
				float xhit = xpos - x; 
				float xs = ( -1.2f /(w*w) * (xhit*xhit) + 1.2f / w * xhit + 0.7f );
				counter.setYdirection(ydirection);
				counter.setXspeed(counter.getXspeed()*xs);
			}
				
		if (ypos > display.height-rad || ypos < rad ) {
		    ydirection *= -1;
		    counter.setYdirection(ydirection);
		}
		if (ypos > h+g+5){
			display.fill(255,0,0);
			display.textSize(12);
			display.text("The ball is lost , hit space to a new ball", 30, 200);
		}
		if(counter.isNewBallEvent() && counter.getBallsRemaining()>0){
			display.noStroke();
			display.fill(204);
			display.rect(25, 180, 240, 55, 0);
			display.rect(xpos-rad, ypos-rad, 10, 10, 0);
			display.stroke(0);
			counter.setWheelXpos(display.width/2);
			counter.setWheelYpos(display.height/2);
			counter.consumeBall();
			counter.setStartNewBallMove();
		}else if (counter.getBallsRemaining()==0){
			display.noStroke();
			display.fill(204);
			display.rect(25, 180, 240, 55, 0);
			display.stroke(0);
			display.fill(255,0,0);
			display.textSize(12);
			display.text("Game over!", 110, 200);
			counter.setGameOver();
		}
		if(counter.getNumBricks()==0){
			display.noStroke();
			display.fill(204);
			display.rect(25, 180, 240, 55, 0);
			display.stroke(0);
			display.fill(255,0,0);
			display.textSize(12);
			display.text("You win!", 110, 200);
			counter.setGameWin();
		}
			
		// Draw the shape
		display.fill(255);
		display.ellipse(xpos, ypos, rad, rad);		
		  
		display.fill(135);
		display.textSize(12);
		display.text(xpos + " - " + ypos, 10, 30);
	}
}
