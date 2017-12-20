package com.sunny.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddressWay extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1.
		request.getRequestDispatcher("").forward(request, response);
		
		// 2. 
		response.sendRedirect("");
		
		// 3
		this.getServletContext().getRealPath("");
		
		// 4.
		this.getServletContext().getResourceAsStream("");
		
		// 5.
		/*
		  <a href="">µãµã</a>
		  <form action="">
		  </form>
		 */
	}
}
