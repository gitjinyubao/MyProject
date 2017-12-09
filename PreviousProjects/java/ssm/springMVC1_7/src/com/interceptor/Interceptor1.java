package com.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.entity.User;

public class Interceptor1 implements  HandlerInterceptor{
	private     static     final   String   []  IGNORE_URI={"login","loginForm"};

	@Override
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("清理执行后的资源");
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("在完成controller的方法之后，进入视图解析器之前");
		
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2 ) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("在进入controller之内，执行方法之前");
		Boolean   flag=false;
	    User   user=(User) arg0.getSession().getAttribute("user");
	    String   ervletPath=arg0.getServletPath();
	    ModelAndView    mv = null;
	   for (String s : IGNORE_URI) {
		   if(ervletPath.contains(s))
		   {
			   System.out.println("判断0");
			   flag=true;
			   break;
		   }
	}
	   if(flag)
	   {    System.out.println("判断1");
	   }
	   else
	   {
		   System.out.println("判断2");
		   if(user==null)
			{
			   System.out.println("判断3");
				flag=false;
				arg0.setAttribute("message", "请从首页登录进入");
				arg0.getRequestDispatcher("login").forward(arg0, arg1);
			}
			else
			{
				 System.out.println("判断4");
				flag=true;
			}
	   }
		return flag;
	}
}
