package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/*
        ����ע��Ŀ�����
       ����ͬʱ������������
       ��������ʵ���κνӿ�    
 */
@Controller
public class IndexController {
	
	/*�����������@RequestMapping���ע�⣬���������һ��������
	  ����ӳ������ķ�����URL*/
	@RequestMapping("/index")
	public    String   doIndex(Model    model)
	{
		String message="hello world";
		model.addAttribute("message",message);
		return   "index";
	}
}
