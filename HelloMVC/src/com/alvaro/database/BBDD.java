package com.alvaro.database;

import java.util.ArrayList;

import com.alvaro.models.Usuario;
import com.alvaro.models.Habitacion;

public class BBDD {

	private static BBDD instance=null;
	
	public ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	public ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();
	
	public static final BBDD getInstance() {
		
		if(instance==null) instance=new BBDD();
		return instance;
	}
	
	private BBDD() {
		this.fillUsuarios();
		this.fillHabitaciones();
		
		this.relacionarUserHab();
	}
	
	private boolean fillUsuarios() {
		usuarios.add(new Usuario(1, "Pepe", "p@p.es", "aaa", null));
		usuarios.add(new Usuario(2, "Pepa", "pa@p.es", "aaa", null));
		usuarios.add(new Usuario(3, "Pepi", "pi@p.es", "aa", null));
	
		return true;
		
		
	}
	
	private boolean fillHabitaciones () {
		habitaciones.add(new Habitacion(1, "Marques", 256, "Madrid"));
		habitaciones.add(new Habitacion(2, "Provenzal", 25, "Madrid"));
		habitaciones.add(new Habitacion(3, "Roca", 56, "Madrid"));
		
		return true;
	}
	
	private boolean relacionarUserHab() {
		usuarios.get(0).setHabitacion(habitaciones.get(2));
		usuarios.get(1).setHabitacion(habitaciones.get(1));
		usuarios.get(2).setHabitacion(habitaciones.get(0));
		
		return true;
	}
	
//	Metodo que en funcion del id me devuelve un usuario concreto. 
//	Si no existe devuelve null. Una vez encontrado el usuario para de buscar (break)
	
	public Usuario getUsuarioById(int id) {
		Usuario usuarioADevolver = null;
		
		for (Usuario unUsuario : this.usuarios) {
			if (unUsuario.getId() == id) {
				usuarioADevolver = unUsuario;
				break; //acabas con las iteraciones
				}
			}		
		return usuarioADevolver;
	}
	
	public Habitacion getHabitacionByHid(int hid) {
		Habitacion habADevolver = null;
		
		for (Habitacion unaHabitacion : habitaciones) {
			if (unaHabitacion.getHid() == hid) {
				habADevolver = unaHabitacion;
				break; //acabas con las iteraciones
				}
			}		
		return habADevolver;
	}

	public boolean existeUsuarioPorEmailYPass(String emailrecibido, String passwordrecibido) {
		
		boolean existeUsuario = false;
		
		
//	for(*objeto/tipo de variable* *variable* : *array*){}
		for (Usuario unUser : usuarios) {
			if (unUser.getEmail().equals(emailrecibido) && unUser.getPassword().equals(passwordrecibido)) {
				existeUsuario = true;
				break; //acabas con las iteraciones
				}			
			}
		
		return existeUsuario;
	
//	public boolean existeUsuarioPorEmailYPass(String emailrecibido, String passwordrecibido) {

//		return false;
//	}
	}

	public int insertaUsuario(Usuario nuevoUser1) {
		int nuevoId=0;
		
		nuevoId=this.usuarios.size()+1; //simulamos que la bd asigna un id consecutivo
		nuevoUser1.setId(nuevoId);
		this.usuarios.add(nuevoUser1);
		
		return nuevoId;
		
	}

	public int insertaHabitacion(Habitacion nuevaHab1) {
		int nuevoHid=0;
		
		nuevoHid=this.habitaciones.size()+1; //simulamos que la bd asigna un id consecutivo
		nuevaHab1.setHid(nuevoHid);
		this.habitaciones.add(nuevaHab1);
		
		return nuevoHid;
		
	}
	
	public boolean deleteUsuario(int id) {
		
		for (Usuario unUsuario : this.usuarios) {
			if (unUsuario.getId() == id) {
				this.usuarios.remove(unUsuario);
				break; //acabas con las iteraciones
				}
			}
		
		
		
		return true;
		
				
	}
}
