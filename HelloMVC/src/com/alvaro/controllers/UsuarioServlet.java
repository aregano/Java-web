package com.alvaro.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alvaro.models.Usuario;
import com.alvaro.database.BBDD;
import com.alvaro.models.Habitacion;

/**
 * Servlet implementation class UsuarioServlet
 */
@WebServlet("/usuario")
public class UsuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UsuarioServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Generar usuario en el Servlet
//		Usuario pepe = new Usuario(1, "Jose", "j@j.es");
//		request.setAttribute("elUsuario", pepe);
//		request.getRequestDispatcher("./usuario.jsp").forward(request, response);
//		response.getWriter().append("Nombre de Usuario: "+pepe.name);

//		Llamar a base de datos

		HttpSession session = request.getSession();

//			Si existe el dato de usuario en sesion -> lo dejo pasar
//			Si no es asi se vuelve al login

		if (session.getAttribute("usuario") != null) {

			BBDD bd = BBDD.getInstance();

			String idUsuario = request.getParameter("id");
			System.out.println("ID recibido: " + idUsuario);

			int idU = Integer.parseInt(idUsuario);
			
			request.setAttribute("elUsuario", bd.getUsuarioById(idU));
			request.getRequestDispatcher("./usuario.jsp").forward(request, response);


			
		} else {
			response.sendRedirect("login");
		}
		;

		

//		BBDD bbdd = new BBDD();
////		Usuario pepe = bbdd.usuarios.get(0);
//		request.setAttribute("elUsuario", bbdd.getUsuarioById(idU));
//
////		el dispatcher sirve para que el servlet decida donde eviar el codigo
//		request.getRequestDispatcher("./usuario.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
