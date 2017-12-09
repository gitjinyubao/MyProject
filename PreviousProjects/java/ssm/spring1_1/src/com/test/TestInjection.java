package com.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.InjectionService;


public class TestInjection {
	
	@Test
	public   void  testInjection()
	{
		ApplicationContext   ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		InjectionService  is=(InjectionService)ac.getBean("injectionServiceImpl");
		is.save("Injection");
		
		
	}

}
