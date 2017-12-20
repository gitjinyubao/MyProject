package com.sunny.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 请求转发，以及使用request域对象把数据带给转发资源
// 请求转发特点：
//          1. 客户端只是发送一次请求，服务器进行多次资源调用
//          2. 客户端浏览地址没变化
public class Forword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data = "aaaa";
		request.setAttribute("data", data);
		
		/*
		          如果在调用forword方法之前，在servlet程序中写入的部分内容已经被真正的传送到客户端，
	   		forword方法将会抛出lllegalStateException
		 */
		
		PrintWriter writer = response.getWriter(); // java.lang.IllegalStateException: Cannot forward after response has been committed
	    writer.write("bbb");
	    writer.close(); 
	    // 会将缓冲数据刷新到浏览器（写入浏览器）.close()方法在一定程度上可以替代.flush()方法；
	    // 如果没有写.close()，容器会在完成了响应时自动关闭（调用.close()）,将内容刷新到浏览器;
	    // 所以如果去掉  writer.close();则不会报异常，并且会将写到缓存的数据清空
	    /*
	                   如果在调用forword方法之前向servlet引擎的缓冲区(response)写入了内容,
		         只要写入到缓冲区的内容还么有真正的被传输到客户端，forword方法就可以被正常执行，
		         原来写入到 输入缓冲区中的内容将被清空，但是已写入到HttpResponse对象中的响应头字段信息保持有效
	     */
		
		/*
		   if(true){
		       request.getRequestDispatcher("/message.jsp").forward(request, response);  
		       // java.lang.IllegalStateException: Cannot forward after response has been committed
		       // 此跳转的时候（forword方法）已经向浏览器开始写入了数据；下面再跳转写入就会出问题
		       // 解决方式：后面加上
		       // return; // 不执行后面的跳转
		   }
		*/
		
		// request也可以实现转发
		request.getRequestDispatcher("/message.jsp").forward(request, response);
	}
	
	/* 
	        注意：
	       如果在调用forword方法之前向servlet引擎的缓冲区(response)写入了内容,
	       只要写入到缓冲区的内容还么有真正的被传输到客户端，forword方法就可以被正常执行，
	       原来写入到 输入缓冲区中的内容将被清空，但是已写入到HttpResponse对象中的响应头字段信息保持有效
	*/

}
