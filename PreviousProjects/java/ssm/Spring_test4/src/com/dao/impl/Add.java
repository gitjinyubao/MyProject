package com.dao.impl;


import org.aspectj.lang.ProceedingJoinPoint;

public class Add {
	public  void   before()
	{
		System.out.println("前置增强");
	}
	public   void   after()
	{
		System.out.println("执行后置增强");
	}
	public  Object   around(ProceedingJoinPoint    joinPoint) throws Throwable
	{
		System.out.println("执行了后置增强1");
		Object   ob=joinPoint.proceed();//使用该参数来激活目标对象的该方法执行
		System.out.println("执行后置增强2");
		return   ob;
		
	}

}
