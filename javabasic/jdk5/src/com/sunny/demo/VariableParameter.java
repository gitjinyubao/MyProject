package com.sunny.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VariableParameter {
	public static void main(String[] args) {
		int a [] = {1, 2, 3};
		String[] b = {"1", "2", "3"};
		show(a); // =show(1,2,3);
		show(2,a); // =show(2,1,2,3);
		System.out.println("=============================");
		
		// 比较list和数组存储元素之后，输出的不同
		List<Integer> listTest = new ArrayList<>();
		listTest.add(1);
		listTest.add(2);
		listTest.add(3);
		System.out.println(listTest); // [1, 2, 3]
		System.out.println(a); // [I@1db9742
		System.out.println("=============================");
		
		// 基本数据类型的数组在java中就是一个特殊的对象
		// asList(T... a) 可变参数是对象
		// 将数组通过工具类转化为集合之后，再输出集合 
		List  listInt = Arrays.asList(a);
		System.out.println(listInt); // [[I@1db9742] : 将整个数组作为一个对象放进去
		System.out.println("===============");
		List  listString = Arrays.asList(b);
		System.out.println(listString); // [1, 2, 3] : 将每个String类型的元素作为一个可变参数对象放进去
	}
	
	public static void show(int ...num) {
		int sum = 0;
		for (int e : num) {
			sum += e;
		}
		System.out.println("sum:" + sum);
	}

	// 当参数不仅仅只是可变参数的时候，将可变参数放置于最后
	public static void show(int x, int ...num) {
		int sum = x;
		for (int e : num) {
			sum += e;
		}
		System.out.println("sum:" + sum);
	}
}
