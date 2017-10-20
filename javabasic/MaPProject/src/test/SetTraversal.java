package test;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SetTraversal {
	
	public static void main(String[] args) {
		// ����Map����
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// ��Ӽ�ֵ��:���ص���ǰ��
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("b", 4);
		
		// �õ����еļ����ϣ�Set��
		Set<String> s = map.keySet();
		
		// �������ϣ���ǿfor��
		for(String k : s) {
			// ���ݼ���ֵ
			System.out.println(k + ":" +map.get(k));
		}
		
		// �õ����е�value���ϣ�collection��
		Collection<Integer> c = map.values();
		
		for (Integer i : c) {
			System.out.println(i);
		}
		
		// �õ����м�ֵ�Եļ���
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		for (Map.Entry<String, Integer> m : set) {
			System.out.println(m.getKey() + ":" +m.getValue());
		}
		
		// �жϼ����а�����/ֵ
		if(map.containsKey("a")) {
			System.out.println(map.containsKey("a"));
		}
		 
		if(map.containsValue(3)) {
			System.out.println(map.containsValue(3));
		}
		
		// keyΪ����
		Student s1 = new Student("a", "aa");
		Student s2 = new Student("b", "bb");
		Student s3 = new Student("c", "cc");
		Student s4 = new Student("b", "bb");
		
		System.out.println(s2.hashCode() == s4.hashCode());
		System.out.println(s2.equals(s4));
		
		// �����s2.hashCode() == s4.hashCode() / s2.equals(s4) Ϊfalse��Student
		// ������д�������������������Ϊkeyʱ�ظ���ӵ�����
		
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
		
		// ����Integer����Ȼ����Integerʵ����Coompareable�Ľӿ�
		for (Integer i : t) {
			System.out.println(i);
		}
	}
}
