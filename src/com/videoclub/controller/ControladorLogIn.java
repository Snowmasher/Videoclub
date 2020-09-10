package com.videoclub.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.videoclub.dao.UsuarioDAOImplDB;
import com.videoclub.model.Usuario;
import com.videoclub.view.LoginFrame;
import com.videoclub.view.MainFrame;

public class ControladorLogIn {
	
	private LoginFrame login;
	private UsuarioDAOImplDB usuarioDAO;
	
	public ControladorLogIn(LoginFrame ventanaPrincipal) throws SQLException {
		super();
		this.login = ventanaPrincipal;
		this.usuarioDAO = new UsuarioDAOImplDB();
	}
	
	public void LogInEvent(String usuario, String contrasena) throws SQLException {
		
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
