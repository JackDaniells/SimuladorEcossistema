package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import model.Gato;
import model.Rato;
import view.Tela;

public class Botoes implements ActionListener {

	Random random = new Random();
	static int numeroRatos;
	
			public void actionPerformed(ActionEvent e) {
				numeroRatos = Integer.parseInt(Tela.retornaTextoInput());
				System.out.println(numeroRatos);
				
				Random r = new Random();
				SelecionaSexo s = new SelecionaSexo();
				
				for (int contador = 0; contador < numeroRatos; contador++) {
							
					Rato ratao = new Rato("Rato "+ contador, s.sexo(),r.nextInt(Tela.tamX), r.nextInt(Tela.tamY));
					Ecossistema.arrayRato.add(ratao);
					Tela.table.setValueAt(ratao, ratao.getPosX(), ratao.getPosY());
				}//for
				
				Ecossistema.gato = new Gato("Tom",s.sexo(), r.nextInt(Tela.tamX), r.nextInt(Tela.tamY));
				
				Tela.table.setValueAt(Ecossistema.gato, Ecossistema.gato.getPosX(), Ecossistema.gato.getPosY());
				
				new Motor();
				
			}//actionPerformed
}//class Botoes
