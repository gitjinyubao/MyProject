package com.advice;


import org.springframework.stereotype.Component;


@Component
public class Service1 {
	public    void  doSave()
	{
		System.out.println("ҵ���ִ�����ݴ洢");
		//throw new RuntimeErrorException(null);
	}
	public    void   dosave1(String s)
	{
		s="jinyubao";
		System.out.println("ҵ��㱣��jinyubao");
	}
	
}
