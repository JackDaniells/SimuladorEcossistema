package model;

public class Rato extends Animal{
	static String especie = "Rato";
	
	
	public Rato(String nome, String sexo, int posicaoX, int posicaoY) {
		super(nome, sexo, especie, posicaoX, posicaoY);
	}
}
