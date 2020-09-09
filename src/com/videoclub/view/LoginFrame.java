package com.videoclub.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.videoclub.controller.ControladorLogIn;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class LoginFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private ControladorLogIn controlLogIn;
	
	
	public LoginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 190, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(10, 11, 43, 14);
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblUsuario);
		
		textField = new JTextField();
		textField.setBounds(10, 36, 135, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblContrasena = new JLabel("Contraseña");
		lblContrasena.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblContrasena.setBounds(10, 67, 65, 14);
		contentPane.add(lblContrasena);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 96, 135, 20);
		contentPane.add(passwordField);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.setBounds(40, 127, 89, 23);
		contentPane.add(btnLogIn);
		btnLogIn.addActionListener(this);
		
		setResizable(false);
		
		this.controlLogIn = new ControladorLogIn(this);
	}


	@Override
	public void actionPerformed(ActionEvent arg) {
		
		controlLogIn.LogInEvent(textField.getText(), new String(passwordField.getPassword()));
		
	}
}
