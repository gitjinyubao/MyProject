package com.a;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class A_Test {
	
	@Test
	public   void   testB()
	{
		ApplicationContext   ac=new  ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		B    b=(B)ac.getBean("b");
		b.say();
	}
}
