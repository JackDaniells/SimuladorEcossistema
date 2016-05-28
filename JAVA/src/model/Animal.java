package model;

public class Animal {
	private String nome;
	private String sexo;	
	
	public Animal(String nome, String sexo){
		this.nome = nome;
		this.sexo = sexo;
	};
	
	public String toString() {
		System.out.println ("Nome: " + nome + " Sexo: "+ sexo);
		return " ";
	};
		
}
