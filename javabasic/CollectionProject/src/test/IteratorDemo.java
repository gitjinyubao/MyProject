package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
	
	public static void main(String[] args) {
		Collection c = new ArrayList<>();
		
		c.add("hello");
		c.add("word");
		c.add("java");
		
		Iterator it = c.iterator();
		
		// next(): ��ȡ��ǰԪ�أ����ҽ���ַָ����һ��Ԫ��
		/*System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());*/
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("===========================");
		
		// for ѭ����д:���ַ�ʽЧ�ʸ�Щ����������֮��itr�ͳ�������������
		for(Iterator itr = c.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}
	}
}
