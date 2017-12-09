package com.advice;

/*
 * 
 */
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import org.springframework.stereotype.Component;

@Component
@Aspect
public class Advice1{
	/*ע��ʽ�����
	��ʱҵ���������Bean����ͬһ��������ʱ����д�е�ʱ
	����Ҫע�ⲻҪ��@Aspectע��������������(@Aspect����£�����)*/
	
	//���干���pointCut
	@Pointcut("execution(* com.advice.*.*(..))")
	public   void   anymethod()
	{
		
	}	
	@Before("anymethod()&&args(arg)")
	public   void     before(Object arg)
	{
		System.out.println("ִ����before"+arg);
	}
	
	@AfterReturning("anymethod()")
	public    void    afterReturning()
	{
		System.out.println("ִ��afterReturning");
	}
	
	@After("anymethod()")
	public    void    afterFinally()
	{
		System.out.println("ִ����afterFinally");
	}
	
	@AfterThrowing("anymethod())")
	public   void     afterThrowing()
	{
		System.out.println("ִ���˴���ع�throw");
	}
	
	@Around("anymethod()")
	public   Object     around(ProceedingJoinPoint    pjp) throws Throwable
	{
		System.out.println("ִ����aroundAdvice����֪ͨ��һ��");
		Object   obj=pjp.proceed();//Ҳ����return  pjp.proceed();
		System.out.println("ִ����aroundAdvice����֪ͨ�ڶ���");
		return    obj;
	}
}
