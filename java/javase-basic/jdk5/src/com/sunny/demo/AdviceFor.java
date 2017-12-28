package com.sunny.demo;

import static java.util.Arrays.asList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * 增强for适用于查询元素，而不能修改元素的值
 */
public class AdviceFor {
	public static void main(String[] args) {
		Integer[] a = {1, 2, 3};
		List<Integer> listInteger = asList(a);
		// 增强for的使用
		for (Integer e : listInteger) {
			System.out.println(e);
		}
		
		System.out.println(a); // [Ljava.lang.Integer;@1db9742
		System.out.println(listInteger); // [1, 2, 3]
		
		System.out.println("===================");
		
		for (int e : a) {
			System.out.println(e);
		}
		
		System.out.println("===================");
		
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("1", 11);
		hashMap.put("2", 22);
		hashMap.put("3", 33);
		
		Set setHashMap = hashMap.keySet();
		Iterator<String> iteratorHashMap = setHashMap.iterator();
		while(iteratorHashMap.hasNext()) {
			System.out.println(hashMap.get(iteratorHashMap.next()));
		}
		
		System.out.println("===================");
		
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("4", 44);
		linkedHashMap.put("5", 55);
		linkedHashMap.put("6", 66);
		Set setLinkedHashMap = linkedHashMap.keySet();
		Iterator<String> iteratorLinkedHashMap = setLinkedHashMap.iterator();
		while(iteratorLinkedHashMap.hasNext()) {
			System.out.println(linkedHashMap.get(iteratorLinkedHashMap.next()));
		}
		
		System.out.println("===================");
		for(Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
			System.out.println(entry.getKey() + entry.getValue());
		}
	}
}
