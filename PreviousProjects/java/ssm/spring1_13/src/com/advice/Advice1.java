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
		System.out.println("执行了before");
	}
	
	
	public    void    afterReturning()
	{
		System.out.println("执行afterReturning");
	}
	
	
	public    void    afterFinally()
	{
		System.out.println("执行了afterFinally");
	}
	
	
	public   void     afterThrowing()
	{
		System.out.println("执行了错误回滚throw");
	}
	
	public   Object     around(ProceedingJoinPoint    pjp) throws Throwable
	{
		System.out.println("执行了aroundAdvice环绕通知第一步");
		Object   obj=pjp.proceed();//也可以return  pjp.proceed();
		System.out.println("执行了aroundAdvice环绕通知第二步");
		return    obj;
	}
}
