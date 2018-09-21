package de.openhpi.capstone1.team23.controller;

import de.openhpi.capstone1.team23.model.Bricks;

public class BreakoutControllerStrategy {

		private Controller breakoutController1;
		private Controller breakoutController2;
		private boolean largeStep = false;
		
		public BreakoutControllerStrategy(Bricks counter) {
			this.breakoutController1 = new BreakoutController(counter);
			this.breakoutController2 = new BreakoutController2(counter);
		}
		
		public void handleEvent() {
			if (largeStep == true) {
				breakoutController1.handleEvent();
				largeStep = false;
			} else {
				breakoutController2.handleEvent();
				largeStep = true;
			}
		}
		

	}

