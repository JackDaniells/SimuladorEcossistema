package control;

import java.util.Timer;
import java.util.TimerTask;

import model.Gato;
import view.Tela;

public class Motor {
	
	 Timer timer;
	
	public Motor(int segundos){
		
		Gato gato = (Gato) Tela.table.getValueAt(Botoes.xGato, Botoes.yGato);
		Tela.table.setValueAt(null, Botoes.xGato, Botoes.yGato);
		System.out.println(Botoes.xGato + " " + Botoes.yGato);
		
		Botoes.xGato = gato.movimentarX(Botoes.xGato);
		Botoes.yGato = gato.movimentarX(Botoes.yGato);
		timer = new Timer();
	    timer.schedule(new RemindTask(), segundos*1000);
	    
	    Tela.table.setValueAt(gato, Botoes.xGato, Botoes.yGato);
		
	}
	
	  class RemindTask extends TimerTask {
	        public void run() {
	            System.out.println("Time's up!");
	            timer.cancel(); //Terminate the timer thread
	            new Motor(1);
	        }
	    }

}
