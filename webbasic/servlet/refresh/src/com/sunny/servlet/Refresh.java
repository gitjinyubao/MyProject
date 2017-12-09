package com.sunny.servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * �����������ʱˢ��
 */
public class Refresh extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		test3(request, response);
	}
	
	// ʵ���Զ���ת 
	private void test3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message = "<meta http-equiv='refresh' content='3;url=refresh/index.jsp'>��ϲ������½�ɹ������������3���ڷ�����ҳ�����û����ת������<a href=''>������</a>";
		this.getServletContext().setAttribute("message", message);
		this.getServletContext().getRequestDispatcher("/message.jsp").forward(request, response);
	}

	@SuppressWarnings("unused")
	private void test2(HttpServletResponse response) throws IOException {
		// �����Ŀ����ǲ������ַ�ʽ��: ��Ϊ���������������jsp����ģ�������servlet���
		// ���ñ���
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		// ��������һ�����ڴ����û���½��servlet
		
		// ����������е��ˣ��û���½�ɹ�
		response.setHeader("refresh", "3;url='/refresh/index.jsp'");
	    response.getWriter().write("��ϲ������½�ɹ������������3���ڷ�����ҳ�����û����ת������<a href=''>������</a>");
	}

	@SuppressWarnings("unused")
	private void test1(HttpServletResponse response) throws IOException {
		// ����ÿ��3��ˢ��һ������
		response.setHeader("refresh", "3");
		
		// ��������ַ���
		String data = new Random().nextInt(10000) + "";
		response.getWriter().write(data);
	}
}
