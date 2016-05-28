
package main;

import model.Coelho;
import model.Lobo;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lobo lobo = new Lobo("AuAu", "Masculino");
		lobo.toString();
		
		Coelho coelho = new Coelho("Mosca", "Feminino");
		coelho.toString();

	}

}
