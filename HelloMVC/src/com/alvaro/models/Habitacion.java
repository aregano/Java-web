package com.alvaro.models;

public class Habitacion {

	 private int hid;
	 private String address;
	 private int number;
	 private String ciudad;
	 
	public Habitacion(int hid, String address, int number, String ciudad) {
		super();
		this.hid = hid;
		this.address = address;
		this.number = number;
		this.ciudad = ciudad;
	}

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
	public boolean esValido() {
		boolean esValid = true;
		
		if (this.address==null || this.address.equals("")) esValid=false;
		
//		if (!this.address.matches("(.*)?[0-9](.*)?")) esValid = false;
		
		if (this.number<=0) esValid=false;
	
		return esValid;
	}
	
}


