
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
