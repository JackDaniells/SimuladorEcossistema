package model;

import java.util.Random;

public class Animal {
	private String nome;
	private String sexo;	
	private int fome;
	private String tipo;

	
	
	public Animal(String nome, String sexo, String esp, int px, int py){
		this.nome = nome;
		this.sexo = sexo;
		this.fome = fome;
		this.tipo= esp;
	};
	
	public int movimentarX(int posX){
		Random r = new Random();
		int valor = r.nextInt(2);
		switch(valor){
		
		
		case 1:
			if(posX < 20){
			posX ++;
			}
		break;
		
		case 2:
			if(posX > 0){
			posX--;
			}
		break;
		
		default:
			break;
		
		}
		return posX;
	}
	
	
	public int movimentarY(int posY){
		Random r = new Random();
		int valor = r.nextInt(2);
		switch(valor){
		
		case 1:
			if(posY < 25){
			posY++;
			}
		break;
		
		case 2:
			if(posY > 0){
			posY--;
			}
		break;
		
		default:
			break;
		
		}
		return posY;
	}

	public String toString() {
		if(tipo.equals("Rato")){
			return "R";
		}else{
			return "G";
		}
	};
		
}
