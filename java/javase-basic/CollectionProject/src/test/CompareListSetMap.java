package test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CompareListSetMap {
	public static void main(String[] args) {
		Set<A> s = new HashSet<A>();
		A a1 = new A("1");
		A a2 = new A("1");
		System.out.println(s.add(a1));
		System.out.println(s.add(a2));
		System.out.println(a1.equals(a2));
		
		System.out.println("=========================");
		Set<String> s1 = new HashSet<String>();
		String a = "1";
		String b = "1";
		System.out.println(s1.add(a));
		System.out.println(s1.add(b));
		System.out.println(a.equals(b));
		
		System.out.println("==========================");
		for (A aa: s) {
			System.out.println(aa.getA());
		}
		
		Iterator<A> ir = s.iterator();
		while (ir.hasNext()) {
			System.out.println(ir.next().getA());
		}
		
		System.out.println("===========================");
		Map<String, String> m = new HashMap<String, String>();
		m.put("1", "1");
		m.put("2", "2");
		
		for (Entry<String, String> mp : m.entrySet()) {
			System.out.println(mp.getKey() + mp.getValue());
		}
		
		for (String key : m.keySet()) {
			System.out.println(key + m.get(key));
		}
		
		for (String value : m.values()) {
			System.out.println(value);
		}
	}
}

class A {
	private String name;
	
	public A(String name) {
		this.name = name;
	}
	
	public void setA(String name) {
		this.name = name;
	}

	public String getA() {
		return name;
	}
}
