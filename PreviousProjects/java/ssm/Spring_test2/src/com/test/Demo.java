package com.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	private Test   t;
	
	public Demo(Test  t)
	{
		this.t=t;
	}
	public static   void  main(String [] args) throws InterruptedException
	{
		ApplicationContext   ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Demo  d=(Demo)ac.getBean("demo");
		
		System.out.println("多例模式");
		Date  d1=(Date) ac.getBean("date");
		SimpleDateFormat  dt=new SimpleDateFormat("yy年MM月dd日    hh时mm分ss秒");
		System.out.println(dt.format(d1));
		Thread.sleep(3000);
		Date  d2=(Date) ac.getBean("date");
		System.out.println(dt.format(d2));
		Thread.sleep(3000);
		Date  d3=(Date) ac.getBean("date");
		System.out.println(dt.format(d3));
		
		
		System.out.println("单例模式");
		Date  d4=(Date) ac.getBean("date1");
		System.out.println(dt.format(d4));
		Thread.sleep(3000);
		Date  d5=(Date) ac.getBean("date1");
		System.out.println(dt.format(d5));
		Thread.sleep(3000);
		Date  d6=(Date) ac.getBean("date1");
		System.out.println(dt.format(d6));
	
	}
}
