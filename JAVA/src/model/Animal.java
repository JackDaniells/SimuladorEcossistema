package model;

import java.util.Random;

public class Animal {
	private String nome;
	private String sexo;	
	private int idadeFertil;
	private double chanceFecundacao;
	private int idadeMax;
	private int fome;
	private String tipo;

	
	
	public Animal(String nome, String sexo, int iF, double cF, int iM, int fome, String esp){
		this.nome = nome;
		this.sexo = sexo;
		this.idadeFertil = iF;
		this.chanceFecundacao = cF;
		this.idadeMax = iM;
		this.fome = fome;
		this.tipo= esp;
	
	};
	
	public int movimentarX(int posX){
		Random r = new Random();
		int valor = r.nextInt(2);
		int retorno = 0;
		switch(valor){
		
		case 0:
			retorno = posX;
		break;
		
		case 1:
			retorno = posX +1;
		break;
		
		case 2:
			retorno = posX -1;
		break;
		
		}
		return retorno;
	}
	
	
	public int movimentarY(int posY){
		Random r = new Random();
		int valor = r.nextInt(2);
		int retorno = 0;
		switch(valor){
		
		case 0:
			retorno = posY;
		break;
		
		case 1:
			retorno = posY +1;
		break;
		
		case 2:
			retorno = posY -1;
		break;
		
		}
		return retorno;
	}

	public String toString() {
		System.out.println("Nome: " + nome + " Sexo: "+ sexo);
		if(tipo.equals("Coelho")){
			return "C";
		}else{
			return "L";
		}
	};
		
}
