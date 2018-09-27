package de.openhpi.capstone1.team23.view;

import java.util.List;

import de.openhpi.capstone1.team23.builder.Brick;
import de.openhpi.capstone1.team23.model.Breakout;
import processing.core.PApplet;

public class BreakoutViewBrick extends AbstractBreakoutView {
	
	public BreakoutViewBrick(PApplet display, Breakout counter) {
		super(display, counter);
	}
	
	public void update() {
		try {
			
			List<Brick> x = counter.getBricks();
			
			int[] colors = new int[3];
			
			int v = 40;
			
			colors[0] = (v * 10) % 255;
			colors[1] = (v * 5) % 255;
			colors[2] = (v * 20) % 255;
			display.fill(colors[0], colors[1], colors[2]);
			
			float ypos;
			float xpos;
			for(int i=0;i<counter.getFilas();i++)
				for(int j=0;j<counter.getColumnas();j++)
					for(int ii=0;ii<x.size();ii++)
						if(x.get(ii).getStatus(i, j) == 1){
							ypos = x.get(ii).getLeftPosY(i, j);
							xpos = x.get(ii).getLeftPosX(i, j);
							display.rect(xpos, ypos, 30, 20);
						}
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}
	}
}
