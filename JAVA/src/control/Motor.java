package control;

import java.util.Timer;
import java.util.TimerTask;

import model.Gato;
import view.Tela;

public class Motor {
	
	 Timer timer;
	
	public Motor(){
		
		Gato gato = (Gato) Tela.table.getValueAt(Botoes.xGato, Botoes.yGato);//pega a posição atual do gato
		Tela.table.setValueAt(null, Botoes.xGato, Botoes.yGato);//Limpa a posição onde o gato estava
		
		Botoes.xGato = gato.movimentarX(Botoes.xGato);// movimenta o gato no eixo X
		Botoes.yGato = gato.movimentarX(Botoes.yGato);// movimenta o gato no eixo Y
		
		timer = new Timer();
	    timer.schedule(new RemindTask(), 1000);
	   
	    //fome do gato
	    if(Tela.table.getValueAt(Botoes.xGato, Botoes.yGato) == null){
	    	gato.setFome(gato.getFome() + 5);
	    }else{
	    	System.out.println("O gato comeu um rato");
	    	gato.setFome(0);
	    }
	    
	    gato.setIdade(gato.getIdade() + 1);// seta idade do gato
	    
	    // mata o gato
	    if(gato.getFome() == 100){
	    	System.out.println("O Gato Morreu de fome");
	    }else if (gato.getIdade() == 30){
	    	System.out.println("O Gato Morreu de velhice");
	    }else{
	    	Tela.table.setValueAt(gato, Botoes.xGato, Botoes.yGato);//seta nova posição do gato
			System.out.println("Posição Gato: X=" + Botoes.xGato + " Y=" + Botoes.yGato);

	    }
		
	}
	
	  class RemindTask extends TimerTask {
	        public void run() {
	           // System.out.println("Time's up!");
	            timer.cancel(); //Terminate the timer thread
	            new Motor();
	        }
	    }

}
