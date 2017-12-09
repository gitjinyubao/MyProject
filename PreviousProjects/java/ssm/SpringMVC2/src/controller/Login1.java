package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

@RequestMapping("/b")
public class Login1 {
	
	@RequestMapping("login")
	public   String   doLogin()
	{
		System.out.println("222222222222");
		return "../index.jsp";
	}
	
	

}
