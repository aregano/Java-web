package com.alvaro.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alvaro.database.BBDD;
import com.alvaro.models.Habitacion;
import com.alvaro.models.Usuario;

/**
 * Servlet implementation class CrearUsuarioServlet
 */
@WebServlet("/newuser")
public class CrearUsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CrearUsuarioServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ArrayList<Habitacion> habitaciones = BBDD.getInstance().habitaciones;
		
		request.setAttribute("lasHabitaciones", habitaciones);
		request.getRequestDispatcher("./newuser.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nombrerecibido = request.getParameter("name");
		String emailrecibido = request.getParameter("email");
		String passwordrecibido = request.getParameter("password");
//		String emailconfirmado=request.getParameter("conf_email");
		String passwordconfirmado = request.getParameter("conf_password");
		String habitacionrecibida = request.getParameter("habitacion");
		
		System.out.println("Habitacion: "+habitacionrecibida);

		System.out.println("Nombre: " + nombrerecibido);
		System.out.println("Email: " + emailrecibido);
		System.out.println("Password: " + passwordrecibido);

		Usuario nuevoUser = new Usuario(0, nombrerecibido, emailrecibido, passwordrecibido, null);

		if (nuevoUser.esValido(passwordconfirmado)) {
//	continuar e introducir el usuario en bbdd
			BBDD bd = BBDD.getInstance();
			
// necesario dar id al usuario creado
			
			bd.insertaUsuario(nuevoUser);
			
			response.sendRedirect("listausuarios");
			
		} else {
			request.setAttribute("mensaje_error", "Datos Incorrectos");
			request.setAttribute("newusuario", nuevoUser);
			this.doGet(request, response);
		}

	}

//	emailrecibido!=null && !emailrecibido.equals("") && emailrecibido.indexOf("@")>0

}
