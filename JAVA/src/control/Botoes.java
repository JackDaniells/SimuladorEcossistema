package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import view.Tela;

import model.Coelho;
import model.Lobo;

public class Botoes implements ActionListener {

	Random random = new Random();

			public void actionPerformed(ActionEvent e) {
				int numeroAnimais = Integer.parseInt(Tela.retornaTextoInput());
				System.out.println(numeroAnimais);
				for (int i = 1; i <= numeroAnimais; i++) {
					Lobo lobo = new Lobo("Lobo " + i, SelecionaSexo.sexo());
					lobo.toString();

					int x1 = random.nextInt(20);
					int y1 = random.nextInt(25);
					Tela.table.setValueAt(lobo, x1, y1);

					Coelho coelho = new Coelho("Coelho " + i, SelecionaSexo
							.sexo());
					coelho.toString();

					int x2 = random.nextInt(20);
					int y2 = random.nextInt(25);
					Tela.table.setValueAt(coelho, x2, y2);

					System.out.println("");
				}
	}
}//class Botoes
