package com.videoclub.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.videoclub.model.Usuario;

public class UsuarioDAOImplDB implements UsuarioDAO {
	
	private Connection connection;
	private List<Usuario> listUsuario;
	private String url = "jdbc:sqlite:Videoclub.db";
	
	public UsuarioDAOImplDB() throws SQLException {
		connect(url);
	}
	
	private void connect(String url) throws SQLException {
		connection = DriverManager.getConnection(url);
	}
	
	private void disconnect() throws SQLException {
		if(connection == null) {return;}
		connection.close();
	}
	
	@Override
	public List<Usuario> getUsuarios() {
		
		listUsuario = new ArrayList<Usuario>();
		
		//TODO: Crear el método para devolver la tabla de usuarios
		
		return listUsuario;
	}

	@Override
	public void addUsuario(Usuario u) throws SQLException {
		PreparedStatement statement = connection.prepareStatement("insert into usuario(id,dni,nombre,apellido1,apellido2,contrasena) values (?,?,?,?,?)");
		statement.setInt(1, u.getId());
		statement.setString(2, u.getDni());
		statement.setString(3, u.getNombre());
		statement.setString(4, u.getApellido1());
		statement.setString(5, u.getApellido2());
		statement.setString(6, u.getContrasena());
		
		
        
        if(statement.executeUpdate() == 0) {
        	System.out.println("---> no se ha realizado el insert");
        }else {
        System.out.println("---> insert realizado con exito");}
		
	}

	
	
}
