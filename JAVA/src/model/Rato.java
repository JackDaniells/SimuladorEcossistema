package model;


public class Rato extends Animal{
	private int idadeFinal = 15;
	public static int idadeMinReprod = 5;

	
	public Rato(String nome, String sexo, int x, int y) {
		super(nome, sexo, x, y);
	}
	
	@Override
	public void update(){
		super.update();
		mover();
	}

	
	public String toString(){
		return Animal.RATO_ICON;
	}
	
}
