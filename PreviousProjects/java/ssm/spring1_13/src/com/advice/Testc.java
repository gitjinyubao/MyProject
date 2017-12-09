package com.advice;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testc {
	@Test
	public   void    testC()
	{
		ApplicationContext   ac=new  ClassPathXmlApplicationContext("applicationContext.xml");
		Service1 s=(Service1)ac.getBean("service1");
		//s.doSave(2);
		s.doSave();
	}
}
