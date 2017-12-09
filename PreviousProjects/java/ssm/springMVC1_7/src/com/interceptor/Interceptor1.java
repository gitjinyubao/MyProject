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
		System.out.println("����ִ�к����Դ");
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("�����controller�ķ���֮�󣬽�����ͼ������֮ǰ");
		
	}

	@Override
	public boolean preHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2 ) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("�ڽ���controller֮�ڣ�ִ�з���֮ǰ");
		Boolean   flag=false;
	    User   user=(User) arg0.getSession().getAttribute("user");
	    String   ervletPath=arg0.getServletPath();
	    ModelAndView    mv = null;
	   for (String s : IGNORE_URI) {
		   if(ervletPath.contains(s))
		   {
			   System.out.println("�ж�0");
			   flag=true;
			   break;
		   }
	}
	   if(flag)
	   {    System.out.println("�ж�1");
	   }
	   else
	   {
		   System.out.println("�ж�2");
		   if(user==null)
			{
			   System.out.println("�ж�3");
				flag=false;
				arg0.setAttribute("message", "�����ҳ��¼����");
				arg0.getRequestDispatcher("login").forward(arg0, arg1);
			}
			else
			{
				 System.out.println("�ж�4");
				flag=true;
			}
	   }
		return flag;
	}
}
