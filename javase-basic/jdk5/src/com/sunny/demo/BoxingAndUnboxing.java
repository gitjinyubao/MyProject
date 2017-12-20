package com.sunny.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BoxingAndUnboxing {
	public static void main(String[] args) {
		Integer iInteger = 1; // װ��
		@SuppressWarnings("unused")
		int iInt = iInteger; // ����
		
		// ����Ӧ��
		List<Integer> list = new ArrayList<Integer>();
		
		// jdk5.0��ǰ��д��
		// list.add(new Integer(1));

		list.add(1); // �Զ�װ��: �洢��list�е��Ƕ��󣬲������� 
		Iterator<Integer> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
