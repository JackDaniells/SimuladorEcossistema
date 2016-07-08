package control;

import java.awt.Color;
import java.awt.Component;
import java.util.Timer;
import java.util.TimerTask;

import model.Gato;
import model.Rato;
import view.Tela;

public class Motor {

	Timer timer;
	int tempo = 1000;
	boolean paraTimer = false;

	public Motor() {

		// pega a posição atual do gato
		Gato gato = (Gato) Tela.table.getValueAt(Botoes.xGato, Botoes.yGato);
		
		//Movimentar ratos
		for(int i = 0; i< Botoes.numeroAnimais;i++){
			if( Tela.table.getValueAt(Botoes.xRato[i], Botoes.yRato[i])!= null &&
					 Tela.table.getValueAt(Botoes.xRato[i], Botoes.yRato[i]).toString()!="🐱"){
			Rato rato = (Rato) Tela.table.getValueAt(Botoes.xRato[i], Botoes.yRato[i]);
			Tela.table.setValueAt(null,Botoes.xRato[i], Botoes.yRato[i]);
			
			Botoes.xRato[i] = rato.movimentarX(Botoes.xRato[i]);
			//System.out.println(Botoes.xRato[i]);
			Botoes.yRato[i] = rato.movimentarY(Botoes.yRato[i]);
			//System.out.println(Botoes.xRato[i]);
			
			//gato come o rato
			if(Botoes.xRato[i]==Botoes.xGato && Botoes.yRato[i]== Botoes.yGato){
				Tela.table.setValueAt(null,Botoes.xRato[i], Botoes.yRato[i]);
				System.out.println("O gato comeu um rato");
				gato.setFome(0);
			}else{
			Tela.table.setValueAt(rato,Botoes.xRato[i], Botoes.yRato[i]);
			}
		  }
		}
		
		//Limpa a posição atual do gato
		Tela.table.setValueAt(null, Botoes.xGato, Botoes.yGato);
		

		//movimenta o gato no eixo X
		Botoes.xGato = gato.movimentarX(Botoes.xGato);

		//movimenta o gato no eixo y
		Botoes.yGato = gato.movimentarX(Botoes.yGato);
		
		

		timer = new Timer();
		timer.schedule(new AvancaTempo(), tempo);
	

		// fome do gato
		if (Tela.table.getValueAt(Botoes.xGato, Botoes.yGato) == null) 
		{
			gato.setFome(gato.getFome() + 5);
		}
		else 
		{
			System.out.println("O gato comeu um rato");
			gato.setFome(0);
		}
		

		gato.setIdade(gato.getIdade() + 1);// seta idade do gato
		

		// mata o gato
		if (gato.getFome() == 100) 
		{
			System.out.println("O Gato Morreu de fome");
			Tela.table.setValueAt("✝", Botoes.xGato, Botoes.yGato);
			paraTimer = true;
		
		} 
		else if (gato.getIdade() == 30) 
		{
			System.out.println("O Gato Morreu de velhice");
			Tela.table.setValueAt("✝", Botoes.xGato, Botoes.yGato);
			paraTimer = true;
		}
		else
		{
			Tela.table.setValueAt(gato, Botoes.xGato, Botoes.yGato);// seta nova
																	// posição
																	// do gato
		}

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

}
