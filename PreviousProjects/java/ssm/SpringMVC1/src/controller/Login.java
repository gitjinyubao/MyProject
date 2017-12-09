package controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import service.Service1;




//Controller注解体代表java类是Controller控制层,负责注册一个Bean到Spring的上下文，id默认为类的全名小写字母。
@Controller
public class Login {
	@Autowired//注入对象
	private Service1  ser;
	
    //通过@RequestMapping来指定的URL路径访问本控制层
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public    String    login(@RequestParam("username" )  String username,@RequestParam("password")   String password,Model  model)
	{
		if(username.equals("1")&&password.equals("1"))
		{
			model.addAttribute("username",username);
			return "ok.jsp";
		}
		else
		{
			return   "no.jsp";
		}
	}
	@RequestMapping("/login1")
	public   String    login1(Model   model)
	{
		List   listusername=ser.getUserms();
		model.addAttribute("listUsername",listusername);
		return   "listusername.jsp";
	}
}
