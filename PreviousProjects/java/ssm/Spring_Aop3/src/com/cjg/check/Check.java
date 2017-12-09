package com.cjg.check;

import org.aspectj.lang.ProceedingJoinPoint;

public class Check {
	/*public void check()
	{
		System.out.println("检验------------------");
	}*/
	public Object   check(ProceedingJoinPoint  joinPoint) throws Throwable
	{
		System.out.println("验证用户");
		Object  result=joinPoint.proceed();
		System.out.println("方法执行完成");
	    return  result;
	}
}
