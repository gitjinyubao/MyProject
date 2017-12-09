package com.advice;

import org.aspectj.lang.ProceedingJoinPoint;


import org.springframework.stereotype.Component;

@Component
public class Advice1{
	
	public   void   pointCut()
	{
		
	}	
	
	public   void     before()
	{
		System.out.println("ִ����before");
	}
	
	
	public    void    afterReturning()
	{
		System.out.println("ִ��afterReturning");
	}
	
	
	public    void    afterFinally()
	{
		System.out.println("ִ����afterFinally");
	}
	
	
	public   void     afterThrowing()
	{
		System.out.println("ִ���˴���ع�throw");
	}
	
	public   Object     around(ProceedingJoinPoint    pjp) throws Throwable
	{
		System.out.println("ִ����aroundAdvice����֪ͨ��һ��");
		Object   obj=pjp.proceed();//Ҳ����return  pjp.proceed();
		System.out.println("ִ����aroundAdvice����֪ͨ�ڶ���");
		return    obj;
	}
}
