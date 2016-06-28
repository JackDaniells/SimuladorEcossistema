package model;

public class Gato extends Animal{
	static String especie = "Gato";
	private int fome = 0;
	private int idade = 0;

	public Gato(String nome, String sexo) {
		super(nome, sexo, especie);
	}

	public int getFome() {
		return fome;
	}

	public void setFome(int fome) {
		this.fome = fome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
