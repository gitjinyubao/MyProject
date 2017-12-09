package com.sunny.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * �������������
 */
public class Expires extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// expries:Thu, 01 Jan 1970 10:00:00 GMT
		// response.setDateHeader("expires", 1000*36000);
		// ���� һ��Сʱ֮��Ƶ�����������������ͬ����Դ��һ��Сʱ�ڵ�������Դֱ���û���
		response.setDateHeader("expires", System.currentTimeMillis() + 1000*36000);
		String data = "aaaaaaaaaaaaaaa";
		response.getWriter().write(data);
	}
}
