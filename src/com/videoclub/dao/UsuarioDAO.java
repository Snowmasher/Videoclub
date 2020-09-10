package com.videoclub.dao;

import java.sql.SQLException;
import java.util.List;
import com.videoclub.model.Usuario;

public interface UsuarioDAO {
	
	public List<Usuario> getUsuarios();
	public void addUsuario(Usuario u) throws SQLException;
}
