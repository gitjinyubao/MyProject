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
		
		System.out.println("����ģʽ");
		Date  d1=(Date) ac.getBean("date");
		SimpleDateFormat  dt=new SimpleDateFormat("yy��MM��dd��    hhʱmm��ss��");
		System.out.println(dt.format(d1));
		Thread.sleep(3000);
		Date  d2=(Date) ac.getBean("date");
		System.out.println(dt.format(d2));
		Thread.sleep(3000);
		Date  d3=(Date) ac.getBean("date");
		System.out.println(dt.format(d3));
		
		
		System.out.println("����ģʽ");
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
