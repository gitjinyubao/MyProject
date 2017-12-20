package test;

import java.sql.Array;
import java.util.ArrayList;

public class NestedSets {
	
	public static void main(String[] args) {
		// 创建大集合
		ArrayList<ArrayList<String>> bigArray = new ArrayList<ArrayList<String>>();
		
		// 创建集合一
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("a");
		list1.add("b");
		list1.add("c");
		
		bigArray.add(list1);
		
		// 创建集合一
		ArrayList<String> list2 = new ArrayList<String>();
		
		list1.add("aa");
		list1.add("bb");
		list1.add("cc");
		
		bigArray.add(list2);
		
		// 嵌套遍历
		for(ArrayList<String> als : bigArray) {
			for(String s : als) {
				System.out.println(s);
			}
		}
	}
}
