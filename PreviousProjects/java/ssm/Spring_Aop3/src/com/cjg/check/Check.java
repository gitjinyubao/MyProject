package com.cjg.check;

import org.aspectj.lang.ProceedingJoinPoint;

public class Check {
	/*public void check()
	{
		System.out.println("����------------------");
	}*/
	public Object   check(ProceedingJoinPoint  joinPoint) throws Throwable
	{
		System.out.println("��֤�û�");
		Object  result=joinPoint.proceed();
		System.out.println("����ִ�����");
	    return  result;
	}
}
