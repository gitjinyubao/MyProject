package com.sunny.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/templeates")
public class HelloController {
	
	@RequestMapping("hello")
	public String hello(Map<String, Object> map) {
		map.put("hello", "david");
		return "hello";
	}
}
