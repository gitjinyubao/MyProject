package com.sunny.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这里使用@RestController(等于@Controller & @RequestBody)
 * @author JinDaShuai -- 金玉宝
 * @version v.0.1
 * @date 2017/12/23
 */
@RestController
public class HelloController {
	
	/**
	 * 使用@RequestMaping建立请求映射
	 * http://localhost:8080/hello
	 * spring boot 默认使用的json解析框架是jackson
	 * @return
	 */
	@RequestMapping("hello")
	public String hello() {
		return "hello-2018";
	}
}
