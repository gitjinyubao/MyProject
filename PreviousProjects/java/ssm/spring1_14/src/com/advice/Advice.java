package com.advice;

import org.springframework.stereotype.Component;

@Component
public class Advice {
	public   void    before()
	{
		System.out.println("执行了前置通知");
	}
}
