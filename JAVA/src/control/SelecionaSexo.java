package control;

import java.util.Random;

public class SelecionaSexo {
	static Random r = new Random();
	
	  public static String sexo(){
      	int sexo = r.nextInt(2);
      	if(sexo == 1){
      		return "Masculino";
      	}else{
      		return "Feminino";
      	}
      };

}
