package com.videoclub.controller;

import java.util.ArrayList;
import java.util.List;
import com.videoclub.dao.UsuarioDAOImpl;
import com.videoclub.model.Usuario;
import com.videoclub.view.LoginFrame;
import com.videoclub.view.MainFrame;

public class ControladorLogIn {
	
	private LoginFrame login;
	private UsuarioDAOImpl usuarioDAO;
	
	public ControladorLogIn(LoginFrame ventanaPrincipal) {
		super();
		this.login = ventanaPrincipal;
		this.usuarioDAO = new UsuarioDAOImpl();
	}
	
	public void LogInEvent(String usuario, String contrasena) {
		
		List<Usuario> listUsuario = new ArrayList<Usuario>();
		
		listUsuario = usuarioDAO.getUsuarios();
		
		for(Usuario u : listUsuario) {
			
			if(u.getNombre().equals(usuario) && u.getContrasena().equals(contrasena)) {
				System.out.println("Logged In!");
				//System.exit(0);
				MainFrame frameMain = new MainFrame();
				frameMain.setVisible(true);
			}
			else {
				System.out.println("Usuario y/o contraseña incorrectos");
			}
			
		}
		
	}
	
}
