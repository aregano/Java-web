package com.alvaro.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alvaro.models.FriendClass;

public class addFriendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public addFriendServlet() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		request.getRequestDispatcher("./addfriend.jsp").forward(request, response);
	
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String idrecibido = request.getParameter("id");
		String nombrerecibido = request.getParameter("name");
		String apellidorecibido = request.getParameter("apellido");
		String edadrecibido = request.getParameter("edad");
		String descripcionrecibida = request.getParameter("descripcion");

		int idint = 0;
		int edadint = 0;
		boolean descbool = true;
		
		try {
			idint = Integer.parseInt(idrecibido);
			edadint = Integer.parseInt(edadrecibido);
			descbool = Boolean.parseBoolean(descripcionrecibida);
		} catch(Exception e) {
			System.out.println("Excepción: "+e.getMessage());
		}
				
		
		
		FriendClass nuevoFriend = new FriendClass (idint,nombrerecibido , apellidorecibido, edadint, descbool);

		
		if(nuevoFriend.esValido()) {
			request.setAttribute("nuevoAmigo", nuevoFriend);
			request.getRequestDispatcher("./addfriend.jsp").forward(request, response);
		}
		
		else {
			request.setAttribute("mensaje_error", "Datos incorrectos");
			request.setAttribute("addfriend", nuevoFriend);
			this.doGet(request, response);
		}
	}

	
}
