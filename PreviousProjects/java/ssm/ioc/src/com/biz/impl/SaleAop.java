package com.biz.impl;

public class SaleAop {
	public void  before()
	{
	        System.out.println("ǰ�油�书��0");
	}
	public void  after()
	{
	        System.out.println("���油�书��0");
	}
	public Object around()
	{
		  Object  result=null;
		  System.out.println("ǰ�油�书��1");
		  System.out.println("���油�书��1");
	      return result;
	}
}
