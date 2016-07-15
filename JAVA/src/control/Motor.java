package control;


import java.util.Timer;
import java.util.TimerTask;

public class Motor {

	Timer timer;
	int tempoClock = 1000;
	public static boolean paraTimer = false;
	public static boolean pausaTimer = false;
	
	public Motor() {
		
		//******** Avança o tempo ************/
		timer = new Timer();
		timer.schedule(new AvancaTempo(),tempoClock);
		new Ecossistema();
	}
	
	class AvancaTempo extends TimerTask {
		public void run() {
			// System.out.println("Time's up!");
			timer.cancel(); // Terminate the timer thread
			
			if(!paraTimer && !pausaTimer){
				new Motor();
			}
		}
	}
	
	}//


	
