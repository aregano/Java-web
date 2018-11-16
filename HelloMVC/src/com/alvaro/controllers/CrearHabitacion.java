package com.alvaro.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alvaro.database.BBDD;
import com.alvaro.models.Habitacion;
import com.alvaro.models.Usuario;

/**
 * Servlet implementation class CrearHabitacion
 */
@WebServlet("/newroom")
public class CrearHabitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CrearHabitacion() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("./newroom.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String direccionrecibida = request.getParameter("address");
		String numerorecibido = request.getParameter("number");
		String ciudadrecibida = request.getParameter("ciudad");

		int numerorecibidoint = 0;
		
		try {
			numerorecibidoint = Integer.parseInt(numerorecibido);
		} catch(Exception e) {
			System.out.println("Excepci�n: "+e.getMessage());
		}
		
		

		System.out.println("Direccion: " + direccionrecibida);

		Habitacion nuevaHab = new Habitacion(0, direccionrecibida, numerorecibidoint, ciudadrecibida);

		if (nuevaHab.esValido()) {

			BBDD bd = BBDD.getInstance();

			bd.insertaHabitacion(nuevaHab);

			response.sendRedirect("newuser");

		} else {
			request.setAttribute("mensaje_error", "Datos erroneos");
			request.setAttribute("newroom", nuevaHab);
			this.doGet(request, response);
		}

	}
}
