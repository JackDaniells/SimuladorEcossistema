package control;

import java.util.ArrayList;
import java.util.Random;

import model.Gato;
import model.Rato;
import view.Tela;

public class Ecossistema {

	public static ArrayList<Rato> arrayRato = new ArrayList<Rato>();
	public static Gato gato;
	public static int ratosComidos = 0;
	Random r = new Random();

	public Ecossistema() {
		atualizaRato();
		atualizaGato();
	}

	private void atualizaGato() {

		Gato gato = (Gato) Tela.table.getValueAt(this.gato.getPosX(),
				this.gato.getPosY());
		Tela.table.setValueAt(null, gato.getPosX(), gato.getPosY());

		gato.update();

		if (Tela.table.getValueAt(gato.getPosX(), gato.getPosY()) == null) {
			Tela.table.setValueAt(gato, gato.getPosX(), gato.getPosY());
		} else {
			Rato rato = (Rato) Tela.table.getValueAt(gato.getPosX(),
					gato.getPosY());
			this.arrayRato.remove(rato);
			gato.zeraFome();
			ratosComidos++;
			System.out.println("O gato comeu um rato");
			Tela.table.setValueAt(gato, gato.getPosX(), gato.getPosY());
		}

	}

	private void atualizaRato() {
		if (arrayRato.size() == 0) {
			Motor.paraTimer = true;
			return;
		}
		for (int i = 0; i < this.arrayRato.size(); i++) {
			Rato rato = this.arrayRato.get(i);
			int xIni = rato.getPosX();
			int yIni = rato.getPosY();

			rato.update();

			if (Tela.table.getValueAt(rato.getPosX(), rato.getPosY()) == null) {
				Tela.table.setValueAt(null, xIni, yIni);
				Tela.table.setValueAt(rato, rato.getPosX(), rato.getPosY());
			} else if (this.gato.getPosX() == rato.getPosX()
					&& this.gato.getPosY() == rato.getPosY()) {
				this.arrayRato.remove(rato);
				Tela.table.setValueAt(null, xIni, yIni);
				this.gato.zeraFome();
				ratosComidos++;
				System.out.println("O gato comeu um rato");
			} else {
				Rato rato2 = (Rato) Tela.table.getValueAt(rato.getPosX(),
						rato.getPosY());
				rato.setaPosicao(xIni, yIni);
				reproduzirRato(rato, rato2);
			}
		}
	}

	public void reproduzirRato(Rato r1, Rato r2) {
		SelecionaSexo s = new SelecionaSexo();
		if ((r1.getIdade() >= Rato.idadeMinReprod)
				&& (r2.getIdade() >= Rato.idadeMinReprod)) {
			if (r1.getSexo() != r2.getSexo()) {
				int prob = r.nextInt(100);
				if (prob >= 75) {
					Rato filho = new Rato("Ratinho", s.sexo(),
							r1.getPosX() - 1 < 0 ? r1.getPosX() + 1
									: r1.getPosX() - 1, r2.getPosY());

					Tela.table.setValueAt(filho, filho.getPosX(),
							filho.getPosY());
					arrayRato.add(filho);
					System.out.println("Nasceu um novo rato");
				}
			}
		}
	}

	public static void CacaRato() {
		// Limpa a posição atual do gato
		// System.out.println("Gato esta caçando!!");
		if (arrayRato.size() == 0) {
			Motor.paraTimer = true;
			return;
		}

		int xG = gato.getPosX();
		int yG = gato.getPosY();
		int iRatoMenorDist = 0;
		int menorDist = 500;
		for (int i = 0; i < arrayRato.size(); i++) {
			Rato rato = arrayRato.get(i);
			int conta = Math.abs(xG - rato.getPosX() + yG - rato.getPosY());

			if (conta < menorDist) {
				menorDist = conta;
				iRatoMenorDist = i;
			}
		}
		menorDist = 500;
		Rato r = arrayRato.get(iRatoMenorDist);
		int xR = r.getPosX();
		int yR = r.getPosY();

		if (xG > xR) {
			if (yG > yR) {
				xG--;
				yG--;
			} else if (yG < yR) {
				xG--;
				yG++;
			} else {
				xG--;
			}
		} else if (xG < xR) {
			if (yG > yR) {
				xG++;
				yG--;
			} else if (yG < yR) {
				xG++;
				yG++;
			} else {
				xG++;
			}
		} else {
			if (yG > yR) {
				yG--;
			} else if (yG < yR) {
				yG++;
			}
		}
		gato.setaPosicao(xG, yG);
	}

}//
