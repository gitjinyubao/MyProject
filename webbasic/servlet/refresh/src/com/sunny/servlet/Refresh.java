package com.sunny.servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 控制浏览器定时刷新
 */
public class Refresh extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		test3(request, response);
	}
	
	// 实现自动跳转 
	private void test3(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message = "<meta http-equiv='refresh' content='3;url=refresh/index.jsp'>恭喜您，登陆成功，浏览器将在3秒内返回首页，如果没有跳转，请点击<a href=''>超链接</a>";
		this.getServletContext().setAttribute("message", message);
		this.getServletContext().getRequestDispatcher("/message.jsp").forward(request, response);
	}

	@SuppressWarnings("unused")
	private void test2(HttpServletResponse response) throws IOException {
		// 真正的开发是不用这种方式的: 因为数据输出最终是由jsp输出的，而不是servlet输出
		// 设置编码
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		// 假设这是一个用于处理用户登陆的servlet
		
		// 假设程序运行到此，用户登陆成功
		response.setHeader("refresh", "3;url='/refresh/index.jsp'");
	    response.getWriter().write("恭喜您，登陆成功，浏览器将在3秒内返回首页，如果没有跳转，请点击<a href=''>超链接</a>");
	}

	@SuppressWarnings("unused")
	private void test1(HttpServletResponse response) throws IOException {
		// 设置每隔3秒刷新一次请求
		response.setHeader("refresh", "3");
		
		// 产生随机字符串
		String data = new Random().nextInt(10000) + "";
		response.getWriter().write(data);
	}
}
