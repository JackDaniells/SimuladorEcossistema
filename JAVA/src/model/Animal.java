package model;

public class Animal {
	private String nome;
	private String sexo;	
	private int idadeFertil;
	private double chanceFecundacao;
	private int idadeMax;
	private int fome;

	
	
	public Animal(String nome, String sexo, int iF, double cF, int iM, int fome){
		this.nome = nome;
		this.sexo = sexo;
		this.idadeFertil = iF;
		this.chanceFecundacao = cF;
		this.idadeMax = iM;
		this.fome = fome;
	
	};
	
	
	
	
	public String toString() {
		System.out.println ("Nome: " + nome + " Sexo: "+ sexo);
		return " ";
	};
		
}
