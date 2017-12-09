package test.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mvcController {
	@RequestMapping("/Luogin")
	public  String   doLuogin(String  username,String  password)
	{
		System.out.println(username+password);
		//return   "redirect:List.jsp";
		return "forward:List.jsp";
	}
}
