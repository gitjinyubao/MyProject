package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/*
        基于注解的控制器
       可以同时处理多个请求动作
       并且无需实现任何接口    
 */
@Controller
public class IndexController {
	
	/*方法上面加上@RequestMapping这个注解，才算得上是一个控制器
	  用来映射请求的方法和URL*/
	@RequestMapping("/index")
	public    String   doIndex(Model    model)
	{
		String message="hello world";
		model.addAttribute("message",message);
		return   "index";
	}
}
