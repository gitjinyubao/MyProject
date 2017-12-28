package test;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		SimulationStack ss = new SimulationStack();
		
		ss.add("a");
		ss.add("b");
		ss.add("c");
		
		while(!ss.isEmpty()) {
			System.out.println(ss.get());
		}
		
		ArrayList list = new ArrayList<>();
		
		list.add(1);
		list.add("hy");
		
		// 普通版for循环
		for (int i = 0; i <list.size(); ++i) {
			// 会报错：向下转型-int
			// String a = (String)list.get(i);
		}
	}
}
