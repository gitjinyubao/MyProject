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
 * ����������ݵ�ʱ��һ��Ҫע���ȼ�飨�Ƿ�Ϊ�գ�
 */
public class Client extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ������Ȩ������
		// getRequestURI���������������е���Դ������(��)
		String uri = request.getRequestURI();
		System.out.println(uri); // /ClienInformation/Client
 		
		// getRequestURL�������ؿͻ��˷�������ʱ������(��---Ҳ���Գ�֮Ϊuri)
		StringBuffer url = request.getRequestURL();
		System.out.println(url); // http://localhost/ClienInformation/Client
		
		// getQueryString ���������������еĲ�������
		String parameterValue = request.getQueryString();
		System.out.println(parameterValue); // a=2
		
		// getRemoteAddr�������ط�������Ŀͻ�����IP��ַ
		String remoteAddr = request.getRemoteAddr();
		System.out.println(remoteAddr); // 127.0.0.1
		
		// getRemoteHost�������ط�������Ŀͻ���������������
		String remoteHost = request.getRemoteHost(); // �������û����DNS����ע�ᣬ����ʾ����IP��ַ
		System.out.println(remoteHost); // 127.0.0.1
		
		// getRemotePort�������ؿͻ�����ʹ�õ�����˿ں�
		System.out.println(request.getRemotePort()); // 50440
		
		// �������ʽ
		System.out.println(request.getMethod());
		
		// ��ȡ����ͷ����������
		// getHeader����
	    String headerValue = request.getHeader("Accept-Encoding");
	    System.out.println(headerValue);
		
		// getHeaders����
	    Enumeration<String> e = request.getHeaders("Accept-Encoding");
	    while(e.hasMoreElements()) {
	    	System.out.println(e.nextElement().toString());
	    }
	    
	    System.out.println("------------------------------");
	    
	    // getHeaderNames���� ����ȡ���ݷ�ʽһ
	    Enumeration<String> headerNames = request.getHeaderNames(); 
		while(headerNames.hasMoreElements()) {
			System.out.println(headerNames.nextElement());
		}
		
		System.out.println("------------------------------");
		
		// getParameter������ ��ȡ���ݷ�ʽ��
		System.out.println(request.getParameter("username"));
		
		// getParameterNames �� ��ȡ���ݷ�ʽ��
		Enumeration<String> parameterNames = request.getParameterNames();
		while(parameterNames.hasMoreElements()) {
			System.out.println(parameterNames.nextElement());
		}
		
		// getParameterValues(): �����ͬ���Ʋ���������ֵ
		String[] parameterValues = request.getParameterValues("userName");
		for(String value : parameterValues) {
			System.out.println(value);
		}
		// �����Ҫ���ֳ���Ľ�׳�Բ�Ҫʹ����ǿforѭ��
		for(int i = 0; parameterValues != null && i < parameterValues.length; i++){
			System.out.println(parameterValues[i]);
		}
		
		// getparameterMap: ��ȡ���ݷ�ʽ��(����)
		Map<String, String[]> map = request.getParameterMap(); // ����ͬ��username��������String[]
		User user = new User();
		try {
			BeanUtils.populate(user, map); // ��map�����������
			// BeanUtils.copyProperties(user, formbean); // ��bean�Ŀ��� 
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		
		System.out.println(user);
		
		// getInputStreamͨ���ֽ����� ��ȡ���ݷ�ʽ��: �������ļ��ϴ�
		InputStream inputStream = request.getInputStream();
		int len = 0;
		byte[] buffer = new byte[1024];
		
		while((len = inputStream.read(buffer)) > 0) {
			System.out.println(new String(buffer, 0, len));
		}
	}
}
