package com.dao.impl;


import org.aspectj.lang.ProceedingJoinPoint;

public class Add {
	public  void   before()
	{
		System.out.println("ǰ����ǿ");
	}
	public   void   after()
	{
		System.out.println("ִ�к�����ǿ");
	}
	public  Object   around(ProceedingJoinPoint    joinPoint) throws Throwable
	{
		System.out.println("ִ���˺�����ǿ1");
		Object   ob=joinPoint.proceed();//ʹ�øò���������Ŀ�����ĸ÷���ִ��
		System.out.println("ִ�к�����ǿ2");
		return   ob;
		
	}

}
