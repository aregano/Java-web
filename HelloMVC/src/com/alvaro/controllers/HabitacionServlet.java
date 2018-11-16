package com.alvaro.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alvaro.database.BBDD;
import com.alvaro.models.Habitacion;
import com.alvaro.models.Usuario;

/**
 * Servlet implementation class HabitacionServlet
 */
@WebServlet("/habitacion")
public class HabitacionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HabitacionServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		Habitacion casapepe = new Habitacion(1, "Pepe", 2, "Anticoli Corrado");
//		   
//        request.setAttribute("laHabitacion", casapepe);
//		request.getRequestDispatcher("./habitacion.jsp").forward(request, response);
		HttpSession session = request.getSession();

//		Si existe el dato de usuario en sesion -> lo dejo pasar
//		Si no es asi se vuelve al login

	if (session.getAttribute("usuario") != null) {

		BBDD bd = BBDD.getInstance();

		String hidHabitacion = request.getParameter("hid");
		System.out.println("HID recibido: "+ hidHabitacion);
		
		int idH = Integer.parseInt(hidHabitacion);
		
		
		Usuario pepe = bd.usuarios.get(0);
		request.setAttribute("elUsuario", bd.getUsuarioById(idH));
		
		
				
		request.setAttribute("laHabitacion", bd.getHabitacionByHid(idH));
		request.getRequestDispatcher("./habitacion.jsp").forward(request, response);

		
	} else {
		response.sendRedirect("login");
	}
	;
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
