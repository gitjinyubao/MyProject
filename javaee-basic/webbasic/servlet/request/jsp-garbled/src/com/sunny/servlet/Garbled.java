package com.sunny.servlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

/*
 * һ��request.setCharacterEncoding()������ȷ�������������Ĳ����Ժ��ֵı�������ȡ��
	        ���ô�request��ȡ�õ�ֵ������ݿ���ȡ����ֵ��
	        ָ�������ͨ��request.getParameter()��ȡ�Լ���Ҫ���ַ���,���û����ǰָ����
	        ��ᰴ�շ�������Ĭ�ϵġ�iso-8859-1�������б��룻�÷���ֻ��post������Ч����get������Ч��
	        ����get����Ӧ����server.xml��ָ����URIEncoding=utf-8��
	        ע�⣺��ִ��request.setCharacterEncoding()֮ǰ����ִ��request.getParameter()������
	       ԭ��Ӧ������ִ�е�һ��getParameter()��ʱ��java���ᰴ�ձ���������е��ύ���ݣ�
	       ��������getParameter()���ٽ��з���������setCharacterEncoding()��Ч��������GET�����ύ���ǣ�
	       �ύ��������URL�У�һ��ʼ���Ѿ����ձ�������ύ���ݣ�setCharacterEncoding()��Ȼ����Ч��
       ����response.setCharacterEncoding():����HTTP ��Ӧ�ı��룬�������÷��������ͻ��˵����ݵı���
               һ�㲻�������������������Ӧ���룬
	     һ��ʹ��response.setContentType()����������HTTP ��Ӧ�ı��룬ͬʱָ�����������ʾ�ı��룻
	     ��Ϊ����ִ�и÷���֪ͨ����������ָ��������б���󣬻��Զ�����response.setCharacterEncoding()
	     ������֪ͨ�������ָ�����������룻ʹ�ô˷���Ҫ��response.getWriter()ִ��֮ǰ��response�ύ֮ǰ��
 */

public class Garbled extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		test1(request);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		test2(request);
		
		test3(request, response);
	}

	// ���get�ύ���� (�ֹ�����	)
	private void test1(HttpServletRequest request) throws UnsupportedEncodingException {
		String username = request.getParameter("username");
		username = new String(username.getBytes("iso8859-1"), "UTF-8"); // ���get��ʽ�ύ�������⣺���ַ������½���
		System.out.println(username);
	}

	// ���post�ύ����
	private void test2(HttpServletRequest request) throws UnsupportedEncodingException {
		// ���÷�����������ķ�ʽ������ȷ�������������Ĳ����Ժ��ֵı�������ȡ�����ô�request��ȡ�õ�ֵ������ݿ���ȡ����ֵ��
		request.setCharacterEncoding("UTF-8"); // ���ַ�ʽֻ�����post�ύ����Ч��
		String username = request.getParameter("username");
		System.out.println(username);
	}
	
	// ���������ҳ
		private void test3(HttpServletRequest request, HttpServletResponse response)
				throws UnsupportedEncodingException, IOException {
			request.setCharacterEncoding("UTF-8"); // ���ַ�ʽֻ�����post�ύ����Ч��
			String username = request.getParameter("username");
			System.out.println(username);
			
			// �������ҳ��������
			response.setCharacterEncoding("gb2312");
			response.setContentType("text/html;charset=gb2312");
			response.getWriter().write(username);
		}
}
