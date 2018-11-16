package com.alvaro.models;

public class Usuario {
	private int id;
	private String name;
	private String email;
	private String password;
	private Habitacion habitacion;

	public Usuario(int id, String name, String email, String password, Habitacion habitacion) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.habitacion = habitacion;
	}

	public int getId() {
		return id;
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	validar un nuevo usuario

	public boolean esValido(String passwordconfirmado) {
		boolean validx = true;

		if (this.email == null || this.email.equals("") || this.email.indexOf("@") <= 0)
			validx = false;

//introducir Regex en nombre

		if (this.name == null || this.name.equals("") || this.name.matches("(.*)?[0-9](.*)?"))
			validx = false;

		if (this.password == null || this.password.equals(""))
			validx = false;

// confirmar password
		if (!this.password.equals(passwordconfirmado))
			validx = false;

		// confirmar email
//		if(!this.email.equals(emailconfirmado)) validx=false;

		return validx;
	}

}
