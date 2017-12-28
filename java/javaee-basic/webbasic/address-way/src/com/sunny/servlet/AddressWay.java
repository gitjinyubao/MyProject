package com.sunny.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// web工程中各类地址的书写
public class AddressWay extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		         技巧:只要是写地址,首先写一个斜的线（如果是给服务器用的：斜线代表当前web应用；如果是给浏览器用的：斜线代表网站）
		 */
		// 1.
		request.getRequestDispatcher("/index1.jsp").forward(request, response); // 地址给服务器使用地址
		
		// 2. 
		response.sendRedirect("/address-way/index2.jsp"); // 地址是给浏览器使用的:/(网站下)的address-way这个web应用的index2.html;一个网站可能有多个web应用
		
		// 3
		this.getServletContext().getRealPath("/index3.jsp"); // 地址是给服务器使用的
		
		// 4.
		this.getServletContext().getResourceAsStream("/public/foot.jsp"); // 地址的使用者是服务器
		
		// 5.
		/*
		  <a href="/address-way/index4.jsp">点点</a> <!-- 给浏览器使用的，浏览器向服务器发送请求 -->
		  
		  <form action="/address-way/index4.jsp"> <!-- 给浏览器使用的，浏览器向服务器发送请求 -->
		  </form>
		 */
	}
}
