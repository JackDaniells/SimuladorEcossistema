package model;

import java.awt.Color;

import java.awt.Component;
import java.util.Random;

public class Animal extends Component {
	private String nome;
	private String sexo;	
	private int fome;
	private String tipo;
	
	private String ratoIcon = "🐭"; 
	private String gatoIcon = "🐱";

	
	
	public Animal(String nome, String sexo, String esp){
		this.nome = nome;
		this.sexo = sexo;
		this.tipo= esp;
	};
	
	public int movimentarX(int posX){
		Random r = new Random();
		int valor = r.nextInt(2);
		switch(valor){
		
		case 0:
			if(posX < 19){
			posX++;
			}
		break;
		
		case 1:
			if(posX > 0){
			posX--;
			}
		break;
		
		case 2:
			break;
		
		}
		return posX;
	}
	
	
	public int movimentarY(int posY){
		Random r = new Random();
		int valor = r.nextInt(2);
		switch(valor){
		
		case 0:
			if(posY < 24){
			posY++;
			}
		break;
		
		case 1:
			if(posY > 0){
			posY--;
			}
		break;
		
		case 2:
		break;
		
		}
		return posY;
	}

	public String toString() {
		if(tipo.equals("Rato")){
			return ratoIcon;
		}else{
			return gatoIcon;
		}
	};
}
