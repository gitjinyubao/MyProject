package com.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;


import com.entity.User;

@Controller
public class ControllerWeb {
	
	@RequestMapping(value="/login")
	public   ModelAndView   doLogin(HttpServletRequest   request,@ModelAttribute("user")   User   user,ModelAndView   mv)
	{
		User    user1=user;
		System.out.println("进入"+user.toString());
		if(user1.getPassword()!= null&&user1.getUsername()!=null)
		{
			if(user.getUsername().equals("1")&&user.getPassword().equals("1"))
			{
				request.getSession().setAttribute("user", user);
				mv.addObject("user", user);
				mv.setViewName("min");
				return mv;
			}
			else
			{
				mv.addObject("message", "请输入正确的账号和密码");
				mv.setViewName("loginForm");
				return   mv;
			}
		}
		else
		{
			mv.setViewName("loginForm");
			return   mv;
		}
	}
	@RequestMapping("/min")
	public    String     doMin()
	{
		return  "min";
	}
}
