package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.TableCellRenderer;


import model.Coelho;
import model.Lobo;

public class Tabela {
	
	    public Tabela() {
	        JFrame frame = new JFrame("Game");

	        JPanel panel = new JPanel();
	        JPanel botoes = new JPanel();
	        panel.setLayout(new BorderLayout());
	        botoes.setLayout(new BorderLayout());
	        final JTable table = new JTable(20,25);
	        table.setBackground(Color.BLUE.darker().darker().darker().darker().darker());
	        table.setGridColor(Color.BLUE.darker().darker());
	        table.setForeground(Color.WHITE);
	        
	        table.setEnabled(false);	// Impede de selecionar e editar campos
	       // table.setShowGrid(false);	//Mostra as linhas e colunas da tabela
	        table.setTableHeader(null);	//Esconde o cabeçalho da tabela
	  
	        JScrollPane tableContainer = new JScrollPane(table);
	        
	        final JTextArea textArea = new JTextArea("");
	        JButton criar = new JButton("Criar");
	        
	        
	        panel.add(tableContainer, BorderLayout.CENTER);
	        botoes.add(textArea, BorderLayout.CENTER);
	        botoes.add(criar, BorderLayout.SOUTH);
	        frame.add(panel, BorderLayout.CENTER);
	        frame.add(botoes, BorderLayout.SOUTH);
	        frame.pack();
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	        criar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					int numeroAnimais = Integer.parseInt(textArea.getText());
					System.out.println(numeroAnimais);
					for(int i = 0; i<=numeroAnimais; i++){
						Lobo lobo = new Lobo("Lobo " + i, "Masculino");
						lobo.toString();
						table.setValueAt("L", 0, i);
						
						Coelho coelho = new Coelho("Coelho " + i, "Masculino");
						coelho.toString();
						table.setValueAt("C", 19,24-i);
						
						System.out.println("");
					}
					
					
				}
			});
	    }
	    
	    
}

/*package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class View {
	
	    public View() {
	        JFrame frame = new JFrame("Game");

	        JPanel panel = new JPanel();
	        panel.setLayout(new BorderLayout());

	        JTable table = new JTable(20,25);
	        table.setBackground(Color.BLUE.darker().darker());
	        table.setGridColor(Color.BLUE.darker().darker());
	        table.setEnabled(false);
	       // table.setShowGrid(false);
	        table.setTableHeader(null);
	        //table.setValueAt('░', 5, 5);
	        //table.setForeground(Color.white);
	        //table.getCell
	        JScrollPane tableContainer = new JScrollPane(table);

	        panel.add(tableContainer, BorderLayout.CENTER);
	        frame.getContentPane().add(panel);

	        frame.pack();
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	    }
}*/