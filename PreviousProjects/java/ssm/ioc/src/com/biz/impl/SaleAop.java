package com.biz.impl;

public class SaleAop {
	public void  before()
	{
	        System.out.println("前面补充功能0");
	}
	public void  after()
	{
	        System.out.println("后面补充功能0");
	}
	public Object around()
	{
		  Object  result=null;
		  System.out.println("前面补充功能1");
		  System.out.println("后面补充功能1");
	      return result;
	}
}
