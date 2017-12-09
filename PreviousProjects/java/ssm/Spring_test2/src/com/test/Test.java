package com.test;

public class Test {
	public Test(int id,int number)
	{
		System.out.println("构造方法一进行了数据注入"+id+""+number);
	}
public Test(String id,String number)
	{
		System.out.println("构造方法二进行了数据注入"+id+""+number);
	}
	//两个重载的构造方法

}
