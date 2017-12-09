package com.interceptor;

import java.io.Flushable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.entity.User;

public class Interceptor implements HandlerInterceptor{
	private   static   final  String[]  IGNORE_URI={"login","loginForm"};

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		System.out.println("������ɣ����к�����Դ����");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("���󵽴�Controller֮��,����viewResolver֮ǰ��������ͼ��������");
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		// TODO Auto-generated method stub
		Boolean   flag=false;
		System.out.println("jiji");
		User   user=(User) request.getSession().getAttribute("user");
		System.out.println("����δ����Controller֮ǰ");
		String  servletPath=request.getServletPath();
		for (String  s : IGNORE_URI) {
			
			System.out.println(servletPath);
			
			if(servletPath.contains(s))
			{
				System.out.println("jiji");
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			if(user==null)
			{
				
				flag=false;
			  	System.out.println("���û�Ϊ�Ƿ��û�");
			  	request.setAttribute("message", "�����µ�¼");
			  	/*if(response.isCommitted())
			  	{
			  		System.out.println("55555");
			  	}*/
			  	request.getRequestDispatcher("loginForm.jsp").forward(request,response);
			}
			else
			{
				 System.out.println("���û�Ϊ�Ϸ��û�");
				 flag=true;
			}
		}
		return flag;
	}
}
