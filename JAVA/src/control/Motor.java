package control;


import java.util.Timer;
import java.util.TimerTask;

import botoes.BtnCriar;

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
			}else{
				System.out.println("__________________________");
				System.out.println("Estatísticas da simulação:");
				System.out.println("Ratos inicio: " + BtnCriar.numeroRatos);
				System.out.println("Ratos atualmente: " + Ecossistema.arrayRato.size());
				System.out.println("Ratos Comidos pelo gato: " + Ecossistema.ratosComidos);
				System.out.println("Idade do gato: " + Ecossistema.gato.getIdade());

				System.out.println("__________________________");
			}
		}
	}
	
	}//


	
