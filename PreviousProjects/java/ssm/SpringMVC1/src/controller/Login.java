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




//Controllerע�������java����Controller���Ʋ�,����ע��һ��Bean��Spring�������ģ�idĬ��Ϊ���ȫ��Сд��ĸ��
@Controller
public class Login {
	@Autowired//ע�����
	private Service1  ser;
	
    //ͨ��@RequestMapping��ָ����URL·�����ʱ����Ʋ�
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
