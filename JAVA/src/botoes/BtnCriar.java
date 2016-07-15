package botoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;

import control.Ecossistema;
import control.Motor;
import control.SelecionaSexo;

import model.Gato;
import model.Rato;
import view.Tela;

public class BtnCriar implements ActionListener {

	Random random = new Random();
	public static int numeroRatos;

	public void actionPerformed(ActionEvent e) {
		numeroRatos = Tela.retornaTextoInput();
		if (numeroRatos > 0 && numeroRatos < 256) {
			System.out.println(numeroRatos);
			Random r = new Random();
			SelecionaSexo s = new SelecionaSexo();

			for (int contador = 0; contador < numeroRatos; contador++) {

				Rato ratao = new Rato("Rato " + contador, s.sexo(),
						r.nextInt(Tela.tamX), r.nextInt(Tela.tamY));
				Ecossistema.arrayRato.add(ratao);
				Tela.table.setValueAt(ratao, ratao.getPosX(), ratao.getPosY());
			}// for

			Ecossistema.gato = new Gato("Tom", s.sexo(), r.nextInt(Tela.tamX),
					r.nextInt(Tela.tamY));

			Tela.table.setValueAt(Ecossistema.gato, Ecossistema.gato.getPosX(),
					Ecossistema.gato.getPosY());

			((JButton) e.getSource()).setEnabled(false);

			new Motor();
		}

	}// actionPerformed
}// class Botoes
