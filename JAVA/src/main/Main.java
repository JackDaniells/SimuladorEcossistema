<<<<<<< HEAD

package main;

import model.Coelho;
import model.Lobo;
import view.Tabela;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Tabela();
		
		Lobo lobo = new Lobo("AuAu", "Masculino");
		lobo.toString();
		
		Coelho coelho = new Coelho("Mosca", "Feminino");
		coelho.toString();

	}

}
=======

package main;

import javax.swing.JFrame;
import javax.swing.JPanel;

import model.Coelho;
import model.Lobo;
import view.View;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*JFrame j = new JFrame();
		JPanel quadro = new JPanel();
		j.setContentPane(quadro);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		j.setSize(500, 500);
		j.setTitle("Game");
		j.setVisible(true);*/
		
		new View();

		
		Lobo lobo = new Lobo("AuAu", "Masculino");
		lobo.toString();
		
		Coelho coelho = new Coelho("Mosca", "Feminino");
		coelho.toString();

	}

}
>>>>>>> da2b31439924003124ef20b362dfba831159a1bb
