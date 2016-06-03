package view;

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
	        table.setBackground(Color.BLUE.darker().darker().darker().darker().darker());
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
}
