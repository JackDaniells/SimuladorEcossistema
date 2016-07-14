package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

import control.Botoes;

public class Tela extends JFrame {
	
	public static int tamX = 20;
	public static int tamY = 25;
	
	private static JTextArea textArea = new JTextArea("");
    private JButton criar = new JButton("Criar");
    private JPanel panel = new JPanel();
    private JPanel botoes = new JPanel();
    public static JTable table = new JTable(tamX,tamY);
    
    private JScrollPane tableContainer;

    Botoes actionListener= new Botoes();
    
	public Tela(){
	
	  panel.setLayout(new BorderLayout());
	  botoes.setLayout(new BorderLayout());
	  
	  //tabela
	   table.setBackground(Color.BLUE.darker().darker().darker().darker().darker());
	   table.setForeground(Color.WHITE);
       table.setEnabled(false);	// Impede de selecionar e editar campos
       table.setTableHeader(null);	//Esconde o cabeçalho da tabela
       //table.setGridColor(Color.BLUE);//cor da grade da tabela
	    // table.setShowGrid(false);	//Mostra as linhas e colunas da tabela

       
	  tableContainer = new JScrollPane(table);
      panel.add(tableContainer, BorderLayout.CENTER);
      botoes.add(textArea, BorderLayout.CENTER);
      botoes.add(criar, BorderLayout.SOUTH);
      this.add(panel, BorderLayout.CENTER);
      this.add(botoes, BorderLayout.SOUTH);
      this.pack();
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);
      criar.addActionListener(actionListener);
  
      
	}//Tela
	
	public static String retornaTextoInput(){
		return textArea.getText();
	}
}//class Tela
