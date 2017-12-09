package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aService.AService;

@RunWith(BlockJUnit4ClassRunner.class)
public class TestA {
	public  static  ApplicationContext getApplicationContext()
	{    
		ApplicationContext ac;
		ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		return ac;
	}
	
	@Test
	public  void   testA()
	{
		
		AService  as=(AService)TestA.getApplicationContext().getBean("aServiceImpl");
		as.save("save");
	}
	

}
