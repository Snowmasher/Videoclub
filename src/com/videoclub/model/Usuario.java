package com.videoclub.model;

import java.util.Date;

//USUARIO (ID,DNI,COD_USUARIO,NOMBRE,APELLIDO1,APELLIDO2,TELEFONO,ES_ADMIN,DESCUENTO,NUM_ALQUILERES,FECHA_ALTA,FECHA_BAJA)

public class Usuario {
	
	private int id;
	private String dni;
	private int codUsuario;
	private String Nombre;
	private String apellido1;
	private String apellido2;
	private int telefono;
	private boolean esAdmin;
	private int descuento;
	private int numAlquileres;
	private Date fechaAlta;
	private Date fechaBaja;
	private String contrasena;
	
	public Usuario() {
		
	}
	
	

	public Usuario(int id, String dni, int codUsuario, String nombre, String apellido1, String apellido2, int telefono,
			boolean esAdmin, int descuento, int numAlquileres, Date fechaAlta, Date fechaBaja, String contrasena) {
		super();
		this.id = id;
		this.dni = dni;
		this.codUsuario = codUsuario;
		Nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.telefono = telefono;
		this.esAdmin = esAdmin;
		this.descuento = descuento;
		this.numAlquileres = numAlquileres;
		this.fechaAlta = fechaAlta;
		this.fechaBaja = fechaBaja;
		this.contrasena = contrasena;
	}



	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final String getDni() {
		return dni;
	}

	public final void setDni(String dni) {
		this.dni = dni;
	}

	public final int getCodUsuario() {
		return codUsuario;
	}

	public final void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
	}

	public final String getNombre() {
		return Nombre;
	}

	public final void setNombre(String nombre) {
		Nombre = nombre;
	}

	public final String getApellido1() {
		return apellido1;
	}

	public final void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public final String getApellido2() {
		return apellido2;
	}

	public final void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public final int getTelefono() {
		return telefono;
	}

	public final void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public final boolean isEsAdmin() {
		return esAdmin;
	}

	public final void setEsAdmin(boolean esAdmin) {
		this.esAdmin = esAdmin;
	}

	public final int getDescuento() {
		return descuento;
	}

	public final void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public final int getNumAlquileres() {
		return numAlquileres;
	}

	public final void setNumAlquileres(int numAlquileres) {
		this.numAlquileres = numAlquileres;
	}

	public final Date getFechaAlta() {
		return fechaAlta;
	}

	public final void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public final Date getFechaBaja() {
		return fechaBaja;
	}

	public final void setFechaBaja(Date fechaBaja) {
		this.fechaBaja = fechaBaja;
	}
	
	public final String getContrasena() {
		return contrasena;
	}

	public final void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", dni=" + dni + ", codUsuario=" + codUsuario + ", Nombre=" + Nombre
				+ ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", telefono=" + telefono + ", esAdmin="
				+ esAdmin + ", descuento=" + descuento + ", numAlquileres=" + numAlquileres + ", fechaAlta=" + fechaAlta
				+ ", fechaBaja=" + fechaBaja + "]";
	}
	
	
}
