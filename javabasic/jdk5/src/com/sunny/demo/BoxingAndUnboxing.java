package com.sunny.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BoxingAndUnboxing {
	public static void main(String[] args) {
		Integer iInteger = 1; // 装箱
		@SuppressWarnings("unused")
		int iInt = iInteger; // 拆箱
		
		// 典型应用
		List<Integer> list = new ArrayList<Integer>();
		
		// jdk5.0以前的写法
		// list.add(new Integer(1));

		list.add(1); // 自动装箱: 存储在list中的是对象，不是整数 
		Iterator<Integer> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
