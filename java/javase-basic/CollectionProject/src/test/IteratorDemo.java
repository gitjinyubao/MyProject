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
		
		// next(): 获取当前元素，并且将地址指向下一个元素
		/*System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());*/
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("===========================");
		
		// for 循环改写:这种方式效率高些；遍历完了之后itr就成了垃圾被回收
		for(Iterator itr = c.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}
	}
}
