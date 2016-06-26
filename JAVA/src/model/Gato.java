package model;

public class Gato extends Animal{
	static String especie = "Gato";

	public Gato(String nome, String sexo, int posicaoX, int posicaoY) {
		super(nome, sexo, especie, posicaoX, posicaoY);
	}

}
