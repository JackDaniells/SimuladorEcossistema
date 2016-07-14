package control;


import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import model.Gato;
import model.Rato;

public class Motor {

	Timer timer;
	int tempoClock = 1000;
	public static boolean paraTimer = false;
	
	public Motor() {
		
		//******** Avança o tempo ************/
		timer = new Timer();
		timer.schedule(new AvancaTempo(), tempoClock);
		new Ecossistema();
	}
	
	class AvancaTempo extends TimerTask {
		public void run() {
			// System.out.println("Time's up!");
			timer.cancel(); // Terminate the timer thread
			
			if(!paraTimer){
				new Motor();
			}
		}
	}
	
	}//


	
