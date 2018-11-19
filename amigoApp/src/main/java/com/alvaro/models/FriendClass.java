package com.alvaro.models;

public class FriendClass {
	
	private int id;
	private String name;
	private String apellido;
	private int edad;
	private boolean descripcion;
	
	public FriendClass(int id, String name, String apellido, int edad, boolean descripcion) {
		super();
		this.id = id;
		this.name = name;
		this.apellido = apellido;
		this.edad = edad;
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isDescripcion() {
		return descripcion;
	}

	public void setDescripcion(boolean descripcion) {
		this.descripcion = descripcion;
	}

	public boolean esValido() {
		boolean validx = true;

		if (this.name == null || this.name.equals("") || this.name.matches("(.*)?[0-9](.*)?"))
			validx = false;

		
		if (this.edad<=0) validx=false;
		
		return validx;
	}
	


}