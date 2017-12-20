package com.sunny.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 使用include方法实现页面包含：实际开发不适用
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
	
	/*  网页源代码：非格式良好的html页面
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
	
	// 修改：
	   /*  删除包含页面的全局架构标签
	   <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	   <html>
	   <head>
	   <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	   <title>Insert title here</title>
	   </head>
	   <body>
	   </body>
	   </html>
	       去掉:<%@ page language="java" pageEncoding="ISO-8859-1"%>
	                 中的contentType="text/html; charset=ISO-8859-1"
	    */
}
