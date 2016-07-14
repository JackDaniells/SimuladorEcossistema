package model;

import java.util.Random;

import view.Tela;

public abstract class Animal{
	private String nome;
	private String sexo;	
	protected int fome = 0;
	protected int idade = 0;
	protected int posX;
	protected int posY;
	
	public static String RATO_ICON = "🐭"; 
	public static String GATO_ICON = "🐱";
	
	private int qtdeFome = 3; 
	
	//construtor
	protected Animal(String nome, String sexo, int x, int y){
		this.nome = nome;
		this.sexo = sexo;
		this.posX = x;
		this.posY = y;
	};

	protected void mover(){
		this.posX += movimentoAleatorio(true, this.posX);
		this.posY += movimentoAleatorio(false,this.posY);
	}
	
	protected void update(){
		this.idade++;
		this.fome+=qtdeFome;
	}
	
	public void zeraFome(){
		this.fome = 0;
	}
	
	public int getPosX(){
		return posX;
	}
	
	public int getPosY(){
		return posY;
	}
	
	public void setaPosicao(int x, int y){
		this.posX = x;
		this.posY = y;
	}
	
	public int getIdade(){
		return idade;
	}
	
	public String getSexo(){
		return sexo;
	}
	
	protected boolean morreDeVelhice(int idadeFinal){
		if (idade == idadeFinal)
		{
			return true;
		} else
			return false;
	}
	
		
	private int movimentoAleatorio(boolean flagX, int valor){
		Random r = new Random();
		int rand = r.nextInt(3);
		int retorno = 0 ;
		switch(rand){
		case 0:
			retorno = 0;
		break;
		
		case 1:
			if(flagX){
				if(valor<Tela.tamX-1) retorno = 1;
				else retorno = -1;
			}else{
				if(valor<Tela.tamY-1) retorno = 1;
				else retorno = -1;
			}
				
		break;
		
		case 2:
			if(valor!=0) retorno = -1;
			else retorno = 1;
		break;
		
		}
		return retorno;
	}
}
