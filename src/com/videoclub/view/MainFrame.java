package com.videoclub.view;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.videoclub.controller.ControladorMain;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;

public class MainFrame extends JFrame implements ItemListener{

	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane_1;
	private ControladorMain mainController;
	private JComboBox<String> comboConsulta;

	public MainFrame(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		comboConsulta = new JComboBox();
		comboConsulta.setBounds(150, 11, 123, 22);
		contentPane.add(comboConsulta);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 137, 414, 113);
		contentPane.add(scrollPane_1);
		
		table = new JTable();
		table.setFont(new Font("Monospaced", Font.PLAIN, 11));
		scrollPane_1.setViewportView(table);
		comboConsulta.addItemListener(this);
		
		this.mainController = new ControladorMain(this);
		StartTable();
	}

	
	public void StartTable() {
		
		comboConsulta.addItem(" ");
		comboConsulta.addItem("Usuarios");
		
	}
	
	public final JTable getTable() {
		return table;
		
	}
	
	/*public final void setTable(JTable table) {
		this.table = table;
		
	}*/
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		if (comboConsulta.getSelectedItem().equals("Usuarios")) {
			mainController.cargarDatos("Usuarios");
				
		}
	}
}
