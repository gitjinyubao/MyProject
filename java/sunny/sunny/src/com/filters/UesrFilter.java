package com.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.entity.User;

//为Ajax改动"insertArticleComment",
public class UesrFilter implements  Filter{
	private  static    final  String   IGNORE_URI []={"Login","login","SignIn","Blogger","Header","Navigate","js","css","User","PublicArticle","SunnyImagesCharacter","selectTitle"};    
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("监听器销毁");
	}

	@SuppressWarnings("unused")
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub
		   System.out.println("监听器执行");
		   System.out.println("1步");
		 
		HttpServletRequest   request=(HttpServletRequest)arg0;
		   HttpServletResponse  response=(HttpServletResponse)arg1;
			// TODO Auto-generated method stub
			Boolean  flag=false;
			String  servletPath=((HttpServletRequest) arg0).getServletPath();
			User   user=(User) ((HttpServletRequest) arg0).getSession().getAttribute("user");
			for (String s : IGNORE_URI) {
				if(servletPath.contains(s))
				{
					System.out.println("2步");
					flag=true;
					break;
				}
			}
			if(flag)
			{
				arg2.doFilter(arg0, arg1);
			}
			else
			{
				if(null!=user)
				{
					System.out.println("3步");
					flag=true;
					arg2.doFilter(arg0, arg1);
				}
				else
				{
					System.out.println("4步");
					/*arg0.setAttribute("message", "请确认注册拥有账户登录");
					flag=false;
					arg0.getRequestDispatcher("Login").forward(arg0, arg1);*/
					//只能返回控制器
					response.sendRedirect("Blogger");
				}	
			}
		}	  
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("监听器初始化");
	}

}
