package test;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SetTraversal {
	
	public static void main(String[] args) {
		// 定义Map集合
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 添加键值对:返回的是前妻
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("b", 4);
		
		// 得到所有的键集合（Set）
		Set<String> s = map.keySet();
		
		// 遍历集合（增强for）
		for(String k : s) {
			// 根据键找值
			System.out.println(k + ":" +map.get(k));
		}
		
		// 得到所有的value集合（collection）
		Collection<Integer> c = map.values();
		
		for (Integer i : c) {
			System.out.println(i);
		}
		
		// 拿到存有键值对的集合
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		for (Map.Entry<String, Integer> m : set) {
			System.out.println(m.getKey() + ":" +m.getValue());
		}
		
		// 判断集合中包含键/值
		if(map.containsKey("a")) {
			System.out.println(map.containsKey("a"));
		}
		 
		if(map.containsValue(3)) {
			System.out.println(map.containsValue(3));
		}
		
		// key为对象
		Student s1 = new Student("a", "aa");
		Student s2 = new Student("b", "bb");
		Student s3 = new Student("c", "cc");
		Student s4 = new Student("b", "bb");
		
		System.out.println(s2.hashCode() == s4.hashCode());
		System.out.println(s2.equals(s4));
		
		// 避免此s2.hashCode() == s4.hashCode() / s2.equals(s4) 为false在Student
		// 类中重写两个方法，解决对象作为key时重复添加的问题
		
		Set<Student> setStudent = new HashSet<Student>();
		setStudent.add(s1);
		setStudent.add(s2);
		setStudent.add(s3);
		setStudent.add(s4);
		
		for (Student st : setStudent) {
			System.out.println(st.toString());
		}
		
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(1);
		t.add(2);
		t.add(7);
		t.add(5);
		
		// 对于Integer会自然排序；Integer实现了Coompareable的接口
		for (Integer i : t) {
			System.out.println(i);
		}
	}
}
