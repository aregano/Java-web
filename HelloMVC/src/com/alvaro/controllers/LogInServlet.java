package com.alvaro.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alvaro.database.BBDD;


@WebServlet("/login")
public class LogInServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LogInServlet() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		request.getRequestDispatcher("./login.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		String emailrecibido=request.getParameter("email");
		String passwordrecibido=request.getParameter("password");
		
		System.out.println("Estoy en el POST!!");
		System.out.println("Email: "+emailrecibido);
		System.out.println("Password: "+passwordrecibido);
		
		BBDD bd = BBDD.getInstance();
		
		boolean existeUser = bd.existeUsuarioPorEmailYPass(emailrecibido, passwordrecibido); 

		
		HttpSession session = request.getSession();
		
		if(existeUser) {
//			generar un flag que se usara en el resto de paginas. Ocurre solo cuando el usuario existe.
			session.setAttribute("usuario", emailrecibido);
			response.sendRedirect("listausuarios");
		}
		
//	decidir si existe usuario con ese email y password, entrar en lista usuarios, si no, volver a mostrar login
	
//		if ( emailrecibido.equals("aa@aa") && passwordrecibido.equals("xxx")) {
////			llevarlo al perfil
////			request.getRequestDispatcher("/listausuarios").forward(request, response);
//			response.sendRedirect("listausuarios");		
//		}
		
		else {
//			volver al login
			request.setAttribute("error", "Usuario o Contraseņa no existen");
			this.doGet(request, response);
			
		}
		
	}
	
}
