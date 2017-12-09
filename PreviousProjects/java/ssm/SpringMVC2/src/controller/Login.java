package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

@RequestMapping("/a")
public class Login {
	
	@RequestMapping("login")
	public   String   doLogin()
	{
		
		return "../index.jsp";
	}
	
	

}
