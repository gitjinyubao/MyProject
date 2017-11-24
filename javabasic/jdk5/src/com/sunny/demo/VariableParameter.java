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
		
		// �Ƚ�list������洢Ԫ��֮������Ĳ�ͬ
		List<Integer> listTest = new ArrayList<>();
		listTest.add(1);
		listTest.add(2);
		listTest.add(3);
		System.out.println(listTest); // [1, 2, 3]
		System.out.println(a); // [I@1db9742
		System.out.println("=============================");
		
		// �����������͵�������java�о���һ������Ķ���
		// asList(T... a) �ɱ�����Ƕ���
		// ������ͨ��������ת��Ϊ����֮����������� 
		List  listInt = Arrays.asList(a);
		System.out.println(listInt); // [[I@1db9742] : ������������Ϊһ������Ž�ȥ
		System.out.println("===============");
		List  listString = Arrays.asList(b);
		System.out.println(listString); // [1, 2, 3] : ��ÿ��String���͵�Ԫ����Ϊһ���ɱ��������Ž�ȥ
	}
	
	public static void show(int ...num) {
		int sum = 0;
		for (int e : num) {
			sum += e;
		}
		System.out.println("sum:" + sum);
	}

	// ������������ֻ�ǿɱ������ʱ�򣬽��ɱ�������������
	public static void show(int x, int ...num) {
		int sum = x;
		for (int e : num) {
			sum += e;
		}
		System.out.println("sum:" + sum);
	}
}
