package control;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import view.Tela;

import model.Gato;
import model.Rato;

public class Botoes implements ActionListener {

	Random random = new Random();
	static int xGato;
	static int yGato;
	static int[] xRato = new int[500];
	static int[] yRato = new int[500];
	static int numeroAnimais;

			public void actionPerformed(ActionEvent e) {
				numeroAnimais = Integer.parseInt(Tela.retornaTextoInput());
				System.out.println(numeroAnimais);
				for (int contador = 0; contador < numeroAnimais; contador++) {
					int x = random.nextInt(20);
					int y = random.nextInt(25);
					xRato[contador] = x;
					yRato[contador] = y;
								
					Tela.table.setValueAt(new Rato("Rato " + contador, "Dolly"),
							x,y);
				}//for
				
				xGato = random.nextInt(20);
				yGato = random.nextInt(25);
				Gato gato = new Gato("Tom","Puresa");
				gato.setBackground(Color.RED);
				
				Tela.table.setValueAt(gato,
						xGato, yGato);
				
				new Motor();
				
				
			}//actionPerformed
}//class Botoes
