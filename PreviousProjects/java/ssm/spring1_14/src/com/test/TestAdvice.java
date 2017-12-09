package com.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.service.B;

public class TestAdvice {
	
	@Test
	public    void    testAdvice()
	{
		ApplicationContext    ac=new    ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		B  b=(B)ac.getBean("a");
		b.change();
		
		/*System.out.println("执行前通知");
		A  a=(A)ac.getBean("a");
		a.say();*/
	}
}
