package com.sunny.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// web�����и����ַ����д
public class AddressWay extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		         ����:ֻҪ��д��ַ,����дһ��б���ߣ�����Ǹ��������õģ�б�ߴ���ǰwebӦ�ã�����Ǹ�������õģ�б�ߴ�����վ��
		 */
		// 1.
		request.getRequestDispatcher("/index1.jsp").forward(request, response); // ��ַ��������ʹ�õ�ַ
		
		// 2. 
		response.sendRedirect("/address-way/index2.jsp"); // ��ַ�Ǹ������ʹ�õ�:/(��վ��)��address-way���webӦ�õ�index2.html;һ����վ�����ж��webӦ��
		
		// 3
		this.getServletContext().getRealPath("/index3.jsp"); // ��ַ�Ǹ�������ʹ�õ�
		
		// 4.
		this.getServletContext().getResourceAsStream("/public/foot.jsp"); // ��ַ��ʹ�����Ƿ�����
		
		// 5.
		/*
		  <a href="/address-way/index4.jsp">���</a> <!-- �������ʹ�õģ��������������������� -->
		  
		  <form action="/address-way/index4.jsp"> <!-- �������ʹ�õģ��������������������� -->
		  </form>
		 */
	}
}
