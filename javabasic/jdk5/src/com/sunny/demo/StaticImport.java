package com.sunny.demo;

import static java.util.Arrays.asList;
import java.util.List;

public class StaticImport {
	
	public static void main(String[] args) {
		
		// 静态导入(导入类的静态属性或者方法)
		String[] s = {"aa","bb","cc"};
		// 如果没有静态导入
		// List<String> listString = Arrays.asList(s);
		// 静态导入之后
		List<String> listString = asList(s);
		for (String str : listString) {//能遍历出各个元素
			System.out.println(str);
		}
		
		Integer[] a = {1, 2, 3};
		List<Integer> listInteger = asList(a);
		// 增强for的使用
		for (Integer e : listInteger) {
			System.out.println(e);
		}
		
		// 对于不是使用包装类定义的数组，需要用集合的object类型接收，然后转化为int类型
		int [] aa = {1, 2, 3};
		List<Object> listInt = asList(aa);
		for (Object e : listInt) {
			System.out.println(Integer.parseInt(e.toString()));
		}
	}
}
