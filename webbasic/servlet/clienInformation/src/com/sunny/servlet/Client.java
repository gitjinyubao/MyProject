package com.sunny.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.sunny.entity.User;

/*
 * 获得请求数据的时候一定要注意先检查（是否为空）
 */
public class Client extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 适用于权限拦截
		// getRequestURI方法返回请求行中的资源名部分(父)
		String uri = request.getRequestURI();
		System.out.println(uri); // /ClienInformation/Client
 		
		// getRequestURL方法返回客户端发出请求时的完整(子---也可以称之为uri)
		StringBuffer url = request.getRequestURL();
		System.out.println(url); // http://localhost/ClienInformation/Client
		
		// getQueryString 方法返回请求行中的参数部分
		String parameterValue = request.getQueryString();
		System.out.println(parameterValue); // a=2
		
		// getRemoteAddr方法返回发出请求的客户机的IP地址
		String remoteAddr = request.getRemoteAddr();
		System.out.println(remoteAddr); // 127.0.0.1
		
		// getRemoteHost方法返回发出请求的客户机的完整主机名
		String remoteHost = request.getRemoteHost(); // 如果主机没有在DNS上面注册，就显示主机IP地址
		System.out.println(remoteHost); // 127.0.0.1
		
		// getRemotePort方法返回客户机所使用的网络端口号
		System.out.println(request.getRemotePort()); // 50440
		
		// 获得请求方式
		System.out.println(request.getMethod());
		
		// 获取请求头和请求数据
		// getHeader方法
	    String headerValue = request.getHeader("Accept-Encoding");
	    System.out.println(headerValue);
		
		// getHeaders方法
	    Enumeration<String> e = request.getHeaders("Accept-Encoding");
	    while(e.hasMoreElements()) {
	    	System.out.println(e.nextElement().toString());
	    }
	    
	    System.out.println("------------------------------");
	    
	    // getHeaderNames方法 ：获取数据方式一
	    Enumeration<String> headerNames = request.getHeaderNames(); 
		while(headerNames.hasMoreElements()) {
			System.out.println(headerNames.nextElement());
		}
		
		System.out.println("------------------------------");
		
		// getParameter方法： 获取数据方式二
		System.out.println(request.getParameter("username"));
		
		// getParameterNames ： 获取数据方式三
		Enumeration<String> parameterNames = request.getParameterNames();
		while(parameterNames.hasMoreElements()) {
			System.out.println(parameterNames.nextElement());
		}
		
		// getParameterValues(): 获得相同名称参数的所有值
		String[] parameterValues = request.getParameterValues("userName");
		for(String value : parameterValues) {
			System.out.println(value);
		}
		// 如果需要体现程序的健壮性不要使用增强for循环
		for(int i = 0; parameterValues != null && i < parameterValues.length; i++){
			System.out.println(parameterValues[i]);
		}
		
		// getparameterMap: 获取数据方式四(常用)
		Map<String, String[]> map = request.getParameterMap(); // 存在同名username，所以用String[]
		User user = new User();
		try {
			BeanUtils.populate(user, map); // 用map集合数据填充
			// BeanUtils.copyProperties(user, formbean); // 用bean的拷贝 
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		
		System.out.println(user);
		
		// getInputStream通过字节流： 获取数据方式五: 适用于文件上传
		InputStream inputStream = request.getInputStream();
		int len = 0;
		byte[] buffer = new byte[1024];
		
		while((len = inputStream.read(buffer)) > 0) {
			System.out.println(new String(buffer, 0, len));
		}
	}
}
