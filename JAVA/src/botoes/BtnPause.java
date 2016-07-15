package botoes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;

import control.Ecossistema;
import control.Motor;
import control.SelecionaSexo;

import model.Gato;
import model.Rato;
import view.Tela;

public class BtnPause implements ActionListener {
	
			public void actionPerformed(ActionEvent e) {
				Motor.pausaTimer = !Motor.pausaTimer;
				if(!Motor.pausaTimer){
					System.out.println("Reiniciou");
					new Motor();
					
					JButton j = (JButton) e.getSource();
					j.setText("Pause");
				}else{
					JButton j = (JButton) e.getSource();
					j.setText("Play");
				}
				System.out.println(Motor.pausaTimer);
			}//actionPerformed
}//class Botoes
