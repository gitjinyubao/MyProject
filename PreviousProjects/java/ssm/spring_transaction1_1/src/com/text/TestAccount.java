package com.text;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.AccountService;

public class TestAccount {
	@Test
	public   void    testAccount()
	{
		ApplicationContext   ac=new   ClassPathXmlApplicationContext("applicationContext.xml");
	    AccountService as=	(AccountService)ac.getBean("accountServiceImpl");
	    as.transfer("aaa", "bbb",500.00);
	}

}
