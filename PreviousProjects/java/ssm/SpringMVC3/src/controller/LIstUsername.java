package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LIstUsername {
	
	@RequestMapping(value="/listUsername"/*,method=RequestMethod.POST*/)
	
	public   String   listUsername(@RequestParam("username") String username,Model   model)
	{
		System.out.println("usernameΩ” ’"+username);
		List    list=new   ArrayList();
	for(int i=0;i<=10;i++)
	{
		list.add("username"+(i+1));
	}
	model.addAttribute("list",list);
	model.addAttribute("username", username);
	return   "listusername.jsp";
	}
}
