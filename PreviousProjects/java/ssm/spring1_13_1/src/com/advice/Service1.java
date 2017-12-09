package com.advice;


import org.springframework.stereotype.Component;


@Component
public class Service1 {
	public    void  doSave()
	{
		System.out.println("业务层执行数据存储");
		//throw new RuntimeErrorException(null);
	}
	public    void   dosave1(String s)
	{
		s="jinyubao";
		System.out.println("业务层保存jinyubao");
	}
	
}
