package control;

import model.Gato;
import view.Tela;

public class Motor {
	
	public Motor(){
		
		Gato gato = (Gato) Tela.table.getValueAt(Botoes.xGato, Botoes.yGato);
		Tela.table.setValueAt(null, Botoes.xGato, Botoes.yGato);
		System.out.println(Botoes.xGato + " " + Botoes.yGato);
		Botoes.xGato = gato.movimentarX(Botoes.xGato);
		Botoes.yGato = gato.movimentarX(Botoes.yGato);
		System.out.println(Botoes.xGato + " " + Botoes.yGato);
		System.out.println("");
		
		try {
			Thread.sleep(1000);
			new Motor();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
