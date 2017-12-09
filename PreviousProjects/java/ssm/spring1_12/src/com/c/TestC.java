package com.c;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestC {
	@Test
	public  void   testC()
	{
		ApplicationContext   ac=new   ClassPathXmlApplicationContext("applicationContext.xml");
		C   c=(C)ac.getBean("c");
		System.out.println(c.toString());
	}
}
