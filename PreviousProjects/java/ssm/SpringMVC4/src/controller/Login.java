package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes(value="userSession")
//也可以同时放置多个session对象
//@SessionAttributes({"a","b"})
@RequestMapping("/a")
public class Login {
	
	@RequestMapping("login")
	public   String   doLogin(Model  model)
	{//如果在Model中存在名为userSession的key，就把key及其对应的值放入到HttpSession中
		model.addAttribute("userSession","userSession111");//为什么userSession用引号包括
		return "../index.jsp";
	}
	@RequestMapping("login1")
	public   String   doLogin(@ModelAttribute("userSession")   String userSession2)
	{//使用此注解的意思是：将HttpSession中key为usernameSession的值注入到userSession2这个参数中
		System.out.println(userSession2);
	 	return "../index1.jsp";
	}
}
