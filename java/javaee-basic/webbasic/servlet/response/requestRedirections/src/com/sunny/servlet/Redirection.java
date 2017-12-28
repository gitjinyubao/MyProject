package com.sunny.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 请求重定向：能不用就尽量不用，因为会导致服务器处理两次请求
 * 登陆使用请求重定向的原因：让地址栏发生变化，告诉用户地址已经跳转，登陆成功，跳到首页
 * 商城使用重定向技术：购买之后进入servle，实现数据库操作，之后跳转到购物清单页面：
 *                   如果使用转发技术，地址栏再刷新一次，无形的又多买了一次（再执行了一次servlet操作）
 *                   使用重定向的话，就是在新的地址栏，无论刷多少次都不会执行servlet里面的操作了
 * 重定向的特点:
 *          浏览器会向服务器发送两次请求；会产生两个response和两个request
 *          地址栏会发生改变
 *           
 * servlet向servetOutputStream或printWriter对象中写入的数据，
 * 将被servlet引擎从response里面获取，servlet引擎将这些数据当作响应消息的正文，
 * 然后再与响应状态行和各响应头组合输出到客户端
 * 
 * Serlvet的service方法结束后，Servlet引擎将检查getWriter或getOutputStream
 * 方法返回的输出流对象是否已经调用过close方法，
 * 如果没有，Servlet引擎将调用close方法关闭该输出流对象。
 */
public class Redirection extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* 注意事项：response.getWrite()和response.getOutputStream()二者不可同时使用)
		   报错：java.lang.IllegalStateException: getWriter() has already been called for this response
		   EG: (两个servlet之间使用转发，只有一个response)servelt1调用servlet2：servlet1里面使用response.getWriter();servlet2里面使用response.getOutputStream();照样会报错
		                 如果使用重定向就是两个请求，两个response不会出现这种报错
		   */
		
		/*response.getWriter();
		response.getOutputStream();*/
		
		// 状态码302:请求的资源找不到，给与你那个资源的地址，你重新去请求
		/*response.setStatus(302);
		response.setHeader("location", "/requestRedirections/index.jsp");*/
		
		// 不了解HTTP协议的使用这种方法
		response.sendRedirect("/requestRedirections/index.jsp");
	}
}
