package com.alvaro.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alvaro.database.BBDD;
import com.alvaro.models.Usuario;


@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DeleteServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		
		//recoger parámetro id
		
		String idUsuario = request.getParameter("id");
		int id = Integer.parseInt(idUsuario);
		
		BBDD.getInstance().deleteUsuario(id);
		
		//borrar usuario de bbdd
		
		
		
		//volver a redirigir a listausuarios servlet
		response.sendRedirect("listausuarios");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
