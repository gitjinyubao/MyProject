package com.sunny.demo;

import static java.util.Arrays.asList;
import java.util.List;

public class StaticImport {
	
	public static void main(String[] args) {
		
		// ��̬����(������ľ�̬���Ի��߷���)
		String[] s = {"aa","bb","cc"};
		// ���û�о�̬����
		// List<String> listString = Arrays.asList(s);
		// ��̬����֮��
		List<String> listString = asList(s);
		for (String str : listString) {//�ܱ���������Ԫ��
			System.out.println(str);
		}
		
		Integer[] a = {1, 2, 3};
		List<Integer> listInteger = asList(a);
		// ��ǿfor��ʹ��
		for (Integer e : listInteger) {
			System.out.println(e);
		}
		
		// ���ڲ���ʹ�ð�װ�ඨ������飬��Ҫ�ü��ϵ�object���ͽ��գ�Ȼ��ת��Ϊint����
		int [] aa = {1, 2, 3};
		List<Object> listInt = asList(aa);
		for (Object e : listInt) {
			System.out.println(Integer.parseInt(e.toString()));
		}
	}
}
