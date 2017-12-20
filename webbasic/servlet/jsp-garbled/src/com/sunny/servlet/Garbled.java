package com.sunny.servlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

/*
 * 一、request.setCharacterEncoding()：用来确保发往服务器的参数以汉字的编码来提取，
	        设置从request中取得的值或从数据库中取出的值。
	        指定后可以通过request.getParameter()获取自己想要的字符串,如果没有提前指定，
	        则会按照服务器端默认的“iso-8859-1”来进行编码；该方法只对post请求有效，对get请求无效；
	        对于get请求，应该在server.xml中指定：URIEncoding=utf-8；
	        注意：在执行request.setCharacterEncoding()之前不能执行request.getParameter()方法；
	       原因：应该是在执行第一个getParameter()的时候，java将会按照编码分析所有的提交内容，
	       而后续的getParameter()不再进行分析，所以setCharacterEncoding()无效。而对于GET方法提交表单是，
	       提交的内容在URL中，一开始就已经按照编码分析提交内容，setCharacterEncoding()自然就无效。
       二、response.setCharacterEncoding():设置HTTP 响应的编码，用于设置服务器给客户端的数据的编码
               一般不会用这个方法来设置响应编码，
	     一般使用response.setContentType()方法来设置HTTP 响应的编码，同时指定了浏览器显示的编码；
	     因为他在执行该方法通知服务器端以指定编码进行编码后，会自动调用response.setCharacterEncoding()
	     方法来通知浏览器以指定编码来解码；使用此方法要在response.getWriter()执行之前或response提交之前；
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

	// 解决get提交乱码 (手工处理	)
	private void test1(HttpServletRequest request) throws UnsupportedEncodingException {
		String username = request.getParameter("username");
		username = new String(username.getBytes("iso8859-1"), "UTF-8"); // 针对get方式提交乱码问题：将字符串重新解码
		System.out.println(username);
	}

	// 解决post提交乱码
	private void test2(HttpServletRequest request) throws UnsupportedEncodingException {
		// 设置服务器这边码表的方式：用来确保发往服务器的参数以汉字的编码来提取，设置从request中取得的值或从数据库中取出的值。
		request.setCharacterEncoding("UTF-8"); // 这种方式只是针对post提交是有效的
		String username = request.getParameter("username");
		System.out.println(username);
	}
	
	// 测试输出网页
		private void test3(HttpServletRequest request, HttpServletResponse response)
				throws UnsupportedEncodingException, IOException {
			request.setCharacterEncoding("UTF-8"); // 这种方式只是针对post提交是有效的
			String username = request.getParameter("username");
			System.out.println(username);
			
			// 输出到网页不会乱码
			response.setCharacterEncoding("gb2312");
			response.setContentType("text/html;charset=gb2312");
			response.getWriter().write(username);
		}
}
