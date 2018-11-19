package com.alvaro.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DimeHelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DimeHelloServlet() {
        super();

    }
    
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			
		String txt = request.getParameter("txt");
		
		
		request.setAttribute("hola", txt);
		request.getRequestDispatcher("./dimehello.jsp").forward(request, response);

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
