package com.advice;



import org.springframework.stereotype.Component;

@Component
public class Service1 {
	public    void  doSave(int a)
	{
		System.out.println("业务层执行数据存储");
		//throw new RuntimeErrorException(null);
	}
	public    void  doSave()
	{
		System.out.println("业务层执行数据存储");
		//throw new RuntimeErrorException(null);
		
	}
}
