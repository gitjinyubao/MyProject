package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.entity.User;

@Controller
public class Controller1 {
	private static     ApplicationContext   ac=null;
	static
	{
		ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}
	@RequestMapping("/login")
	public   String    doLogin(HttpSession   session,String username,String  password,Model   model)
	{
		
		/*User    user1=(User) ac.getBean("user");
		 * System.out.println(user1.toString());
		 * 
		 * User    user1=(User) ac.getBean("user");
		   User    user2=(User) ac.getBean("user");
		   System.out.println(user1.equals(user2));
		   System.out.println(user1==user2);
		 * 和user不是同一个对象
		 * user只是一个接收参数的对象，不是从容器中获得的
		 */
		
		 if(password!=null&&password.equals("123")&&username!=null&username.equals("123"))
	    {
			User   user=new User(username,password);
	    	session.setAttribute("user", user);
	    	
	    	return    "min";
	    }
	    else
	    {
	    	System.out.println(username);
	    	return     "loginForm";
	    }
	}
}
