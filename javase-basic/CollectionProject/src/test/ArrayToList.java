package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * 虽然可以将数组转化为集合，但是本质还是数组，list不能增加或删除改变长度，只能对转化过来的
 * 集合实现修改操作
 * Arrays.asList(T...t);可变参数
 */
public class ArrayToList {
	
	public static void main(String[] args) {
		String[] array  = {"a", "b","b","b","c"};
		
		List<String> list = Arrays.asList(array);
		
		// 去除重复元素
		Set<String> s = new HashSet<String>(list);
		
		List<String> listOne = new ArrayList<String>(s); 
		
		for (String a : listOne) {
			System.out.println(a);
		}
		
		System.out.println("===========================");
		
		List<String> lt = Arrays.asList();
		
		for (String a : lt) {
			System.out.println(a);
		}
		
		System.out.println("===========================");
		
		List<String> lts = Arrays.asList("hello", "word");
		
		for (String a : lts) {
			System.out.println(a);
		}
	}
}
