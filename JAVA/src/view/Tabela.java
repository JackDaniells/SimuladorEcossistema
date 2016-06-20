package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.TableCellRenderer;

public class Tabela {
	
	    public Tabela() {
	        JFrame frame = new JFrame("Game");

	        JPanel panel = new JPanel();
	        JPanel botoes = new JPanel();
	        panel.setLayout(new BorderLayout());
	        botoes.setLayout(new BorderLayout());
	        JTable table = new JTable(20,25);
	        table.setBackground(Color.BLUE.darker().darker().darker().darker().darker());
	        table.setGridColor(Color.BLUE.darker().darker());
	        
	        table.setEnabled(false);	// Impede de selecionar e editar campos
	       // table.setShowGrid(false);	//Mostra as linhas e colunas da tabela
	        table.setTableHeader(null);	//Esconde o cabeçalho da tabela
	  
	        JScrollPane tableContainer = new JScrollPane(table);
	        
	        JTextArea textArea = new JTextArea("");
	        
	        panel.add(tableContainer, BorderLayout.CENTER);
	        botoes.add(textArea, BorderLayout.CENTER);
	        botoes.add(new JButton("Criar"), BorderLayout.SOUTH);
	        frame.add(panel, BorderLayout.CENTER);
	        frame.add(botoes, BorderLayout.SOUTH);
	        frame.pack();
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
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