package com.a;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestC {

	@Test
	public   void    testC()
	{
		ApplicationContext   ac=new  ClassPathXmlApplicationContext("applicationContext.xml");
		A   a=(A)ac.getBean("A");
		System.out.println(a);
	}
}
