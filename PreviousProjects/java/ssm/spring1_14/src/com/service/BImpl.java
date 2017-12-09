package com.service;

import org.springframework.stereotype.Component;

@Component
public class BImpl implements B {

	@Override
	public void change() {
		// TODO Auto-generated method stub
		System.out.println("我是被替换的对象方法");
	}
}
