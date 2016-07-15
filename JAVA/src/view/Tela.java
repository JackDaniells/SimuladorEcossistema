package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

import botoes.BtnCriar;
import botoes.BtnPause;
import botoes.BtnReset;


public class Tela extends JFrame {
	
	public static int tamX = 20;
	public static int tamY = 25;
	
	private static JTextArea textArea = new JTextArea("");
    private JButton criar = new JButton("Criar");
    private JButton reset = new JButton("Reset");
    private JButton pause = new JButton("Pause");
    private JPanel panel = new JPanel();
    private JPanel input = new JPanel();
    private JPanel botoes = new JPanel();
    public static JTable table = new JTable(tamX,tamY);
    
    private JScrollPane tableContainer;

    BtnCriar btnCriar= new BtnCriar();
    BtnReset btnReset= new BtnReset();
    BtnPause btnPause= new BtnPause();
    
	public Tela(){
	
	  panel.setLayout(new BorderLayout());
	  input.setLayout(new BorderLayout());
	  botoes.setLayout(new FlowLayout());
	  
	  //tabela
	   table.setBackground(Color.BLUE.darker().darker().darker().darker().darker());
	   table.setForeground(Color.WHITE);
       table.setEnabled(false);	// Impede de selecionar e editar campos
       table.setTableHeader(null);	//Esconde o cabeçalho da tabela
       //table.setGridColor(Color.BLUE);//cor da grade da tabela
	    // table.setShowGrid(false);	//Mostra as linhas e colunas da tabela

      botoes.add(reset);
      botoes.add(pause);
	  tableContainer = new JScrollPane(table);
      panel.add(tableContainer, BorderLayout.CENTER);
      input.add(textArea, BorderLayout.CENTER);
      input.add(criar, BorderLayout.SOUTH);      
      this.add(panel, BorderLayout.NORTH);
      this.add(botoes, BorderLayout.CENTER);
      this.add(input, BorderLayout.SOUTH);
      this.pack();
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);
      criar.addActionListener(btnCriar);
      pause.addActionListener(btnPause);
      reset.addActionListener(btnReset);
  
      
	}//Tela
	
	public static int retornaTextoInput(){
		try{
			return Integer.parseInt(textArea.getText());
		}catch(Exception e){
			System.out.println("Insira somente Numeros entre 1 e 255");
			return 0;
		}
			
	}
	
	public static void limpaTabela(){
		for(int i = 0; i< tamX; i++){
			for(int j = 0; j< tamY; j++){
				
				table.setValueAt(null, i, j);
			}
		}
	}
}//class Tela
