package com.sunny.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// ʹ��include����ʵ��ҳ�������ʵ�ʿ���������
public class Page extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/public/head.jsp").include(request, response);
		response.getWriter().write("hhahhaha");
		request.getRequestDispatcher("/public/foot.jsp").include(request, response);
	}
	
	/*  ��ҳԴ���룺�Ǹ�ʽ���õ�htmlҳ��
		<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
		<html>
		<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		</head>
		<body>
		  head <br />
		</body>
		</html>hhahhaha<br />
		<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
		<html>
		<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		</head>
		<body>
		  foot <br />
		</body>
		</html>
	 */
	
	// �޸ģ�
	   /*  ɾ������ҳ���ȫ�ּܹ���ǩ
	   <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	   <html>
	   <head>
	   <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	   <title>Insert title here</title>
	   </head>
	   <body>
	   </body>
	   </html>
	       ȥ��:<%@ page language="java" pageEncoding="ISO-8859-1"%>
	                 �е�contentType="text/html; charset=ISO-8859-1"
	    */
}
