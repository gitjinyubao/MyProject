package com.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.InjectionService;

public class InjectionTest {
	public   static  ApplicationContext   ac;
	static  
	{
		ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");	
	}
	@Test
	public   void   testInjection()
	{
		InjectionService    is=(InjectionService)InjectionTest.ac.getBean("injectionServiceImpl");
		is.save();
		InjectionService    is1=(InjectionService)InjectionTest.ac.getBean("injectionServiceImpl");
		System.out.println(is.equals(is1));
		System.out.println(is==is1);
	}
}
