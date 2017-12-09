package com.a;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA {
	
	@Test
	public   void    testA()
	{
		  ApplicationContext   ac=new   ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		  A_interface   a_interface=(A_interface)ac.getBean("b");
	      a_interface.destroy();
	      a_interface.init();
	}
} 
