package com.videoclub.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.videoclub.model.Usuario;

public class UsuarioDAOImpl implements UsuarioDAO {

	@Override
	public List<Usuario> getUsuarios() {
		
		List<Usuario> listUsuarios = new ArrayList<Usuario>();
		
		Date fechaIni = new Date();
		Date fechaBaja = new Date();
		
		Usuario admin = new Usuario(00, "00000000A", 0000, "Admin", "admin", "admin", 654321987,
				true, 100, 0, fechaIni, fechaBaja, "abc123");
		
		listUsuarios.add(admin);
		
		return listUsuarios;
	}

}
