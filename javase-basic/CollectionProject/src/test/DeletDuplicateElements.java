package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class DeletDuplicateElements {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(6);
		list.add(1);
		
		// 使用get()的for遍历
		for (int i = 0; i < list.size(); i++) {
			for (int j = i+1; j < list.size(); ++j) {
				if (list.get(i).equals(list.get(j))) {
					list.remove(j);
					--j;
				}
			}
		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("====================================");
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(6);
		list.add(1);
		
		// 使用迭代器
		Iterator it = list.iterator();
		
		// 准备一个新的集合
		ArrayList<Integer> list1 = new ArrayList<>();
		
		while(it.hasNext()) {
			int nowNumber = (int) it.next();
			if (!list1.contains(nowNumber)) {
				list1.add(nowNumber);
			}
		}
		
		list.clear();
		list.addAll(list1);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		LinkedList<Integer> listLink = new LinkedList<>();
		listLink.addFirst(1);
		listLink.addFirst(2);
		listLink.addFirst(3);
		
		// 普通版for循环
		for (int i = 0; i < listLink.size(); ++i) {
			System.out.println(listLink.get(i));
		}
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		
		// 增强版for循环: 底层实现是迭代器
		if (!al.isEmpty()) {
			for (String s : al) {
				System.out.println(s);
			}
		}
	}
}