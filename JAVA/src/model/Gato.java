package model;

import view.Tela;
import control.Ecossistema;
import control.Motor;


public class Gato extends Animal{
	
	private int idadeFinal = 50;
	
	public Gato(String nome, String sexo, int x, int y) {
		super(nome, sexo,x,y);
	}
	
	protected boolean morreDeFome(){
		if (fome == 100)
		{
			return true;
		} else
			return false;
	}
	
	@Override
	public void update(){
		super.update();
		
		mover();
		
		if(morreDeVelhice(idadeFinal) || morreDeFome()) {
			Motor.paraTimer = true;
			GATO_ICON = "✝";
			//Tela.table.setValueAt("✝", posX, posY);
			System.out.println("O Gato morreu");
		}
	}
	
	@Override
	protected void mover(){
		if(fome<25){
			super.mover();
		}else{
			Ecossistema.CacaRato();
			
		}
	}
	
	public String toString(){
		return GATO_ICON;
	}
}
