package com.sunny.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 1.新建一class,这里取名GlobalDefaultExceptionHandler
 * 2.在class上添加注解，@ControllerAdvice
 * 3.在class中添加一个方法
 * 4.在方法上添加@ExceptionHandler拦截相应的异常信息
 * 5.如果返回的view -- 方法的返回值是ModelAndView
 * 6.如果返回的是String或者是Json数据，那么需要在方法上添加@ResponseBody注解(以json格式返回)
 * 
 * @author JinDaShuai
 * @version v.0.1
 * @data 2017/12/28
 */
@ControllerAdvice
public class GlobalDefaultExceptionHandler {

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public String defaultExceptionHandler(HttpServletRequest req, Exception e) {
		// 是返回的String
		return "对不起，服务器繁忙";
		
		// ModelAndView
		/*ModelAndView mv = new ModelAndView();
		mv.setView(view);*/
	}
}
