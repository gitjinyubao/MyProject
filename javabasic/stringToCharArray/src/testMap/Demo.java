package testMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.print.attribute.HashAttributeSet;

public class Demo {
	public static void main(String[] args) {
		Map<String, String> m = new HashMap<String, String>();
		
		m.put("a", "a1");
		m.put("a", "a2");
		
		System.out.println(m.get("a"));
		
		for (Entry<String, String> e : m.entrySet()) {
			System.out.println(e.getValue());
		}
	}
}
