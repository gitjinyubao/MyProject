package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;



public class CharEncodingFilter  implements  Filter {
	public void destroy() {
		System.out.println("filter����");
	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		    arg0.setCharacterEncoding("utf-8");
		    arg1.setCharacterEncoding("utf-8");
		    arg2.doFilter(arg0, arg1);
		    
	}

	public void init(FilterConfig arg0) throws ServletException {	
		System.out.println("filter��ʼ��");
	}

}
