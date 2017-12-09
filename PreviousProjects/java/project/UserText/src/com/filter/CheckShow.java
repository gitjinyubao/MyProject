package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entitty.User;

public class CheckShow implements Filter{

	public void destroy() {
	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		HttpServletRequest   request=(HttpServletRequest)arg0;
		HttpServletResponse   response=(HttpServletResponse)arg1;
		User user=(User)request.getSession().getAttribute("Textuser");
		if(null!=user)
		{
			arg2.doFilter(arg0, arg1);
		}
		else
		{
			response.sendRedirect("Luogin.jsp");
		}
	}

	public void init(FilterConfig arg0) throws ServletException {
	}

}
