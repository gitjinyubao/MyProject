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
	/*注解式切入点
	此时业务层与切面Bean处于同一个包，这时候在写切点时
	，就要注意不要把@Aspect注解的类包含其中了(@Aspect情况下，特殊)*/
	
	//定义共享的pointCut
	@Pointcut("execution(* com.advice.*.*(..))")
	public   void   anymethod()
	{
		
	}	
	@Before("anymethod()&&args(arg)")
	public   void     before(Object arg)
	{
		System.out.println("执行了before"+arg);
	}
	
	@AfterReturning("anymethod()")
	public    void    afterReturning()
	{
		System.out.println("执行afterReturning");
	}
	
	@After("anymethod()")
	public    void    afterFinally()
	{
		System.out.println("执行了afterFinally");
	}
	
	@AfterThrowing("anymethod())")
	public   void     afterThrowing()
	{
		System.out.println("执行了错误回滚throw");
	}
	
	@Around("anymethod()")
	public   Object     around(ProceedingJoinPoint    pjp) throws Throwable
	{
		System.out.println("执行了aroundAdvice环绕通知第一步");
		Object   obj=pjp.proceed();//也可以return  pjp.proceed();
		System.out.println("执行了aroundAdvice环绕通知第二步");
		return    obj;
	}
}
