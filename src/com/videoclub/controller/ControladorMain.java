package com.videoclub.controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import com.videoclub.dao.UsuarioDAOImpl;
import com.videoclub.model.Usuario;
import com.videoclub.view.MainFrame;

public class ControladorMain {
	
	private MainFrame frameMain;
	private UsuarioDAOImpl usuarioDAO;
	
	public ControladorMain(MainFrame frameMain) {
		super();
		
		this.frameMain = frameMain;
		this.usuarioDAO = new UsuarioDAOImpl();
		
	}
	
	public void cargarDatos(String value) {
		
		if(value.equals("Usuarios")){
			
			List<Usuario> listaUsuarios = new ArrayList<Usuario>();
			listaUsuarios = usuarioDAO.getUsuarios();
			DefaultTableModel model = new DefaultTableModel();
			
			model.addColumn("DNI");
			model.addColumn("Nombre");
			model.addColumn("Telefono");
			model.addColumn("Descuento");
			model.addColumn("Alquileres");
			
			for (int i = 0; i<listaUsuarios.size(); i++ ) {
				Object[] objeto = new Object[5];
				objeto[0] = listaUsuarios.get(i).getDni();
				objeto[1] = listaUsuarios.get(i).getNombre();
				objeto[2] = listaUsuarios.get(i).getTelefono();
				objeto[3] = listaUsuarios.get(i).getDescuento();
				objeto[4] = listaUsuarios.get(i).getNumAlquileres();
				model.addRow(objeto);
			}
			
			this.frameMain.getTable().setModel(model);
		}
		
	}
}
