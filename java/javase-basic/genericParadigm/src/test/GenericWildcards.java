package test;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 泛型高级(通配符)
 * ？: 任意类型，如果没明确，就是Object类或者java任意类
 * ？ Extends E:
 * ? super E:
 */
public class GenericWildcards {
	
	// 泛型如果明确的写的时候，前后必须一致
	/*Collection<Object> c1 = new ArrayList<Object>();
	Collection<Object> c2 = new ArrayList<B>();
	Collection<Object> c3 = new ArrayList<C>();*/

	// ？表示任意的类型都是可以的
	Collection<?> cc1 = new ArrayList<Object>();
	Collection<?> cc2 = new ArrayList<B>();
	Collection<?> cc3 = new ArrayList<C>();
	
	// ？ extends E 向下限定，E及其子类
	Collection<? extends B> ccc1 = new ArrayList<B>();
	
	// ? super E 向上限定， E及其父类
	Collection<? super B> ccc2 = new ArrayList<B>();
	Collection<? super B> ccc3 = new ArrayList<A>();
}

class A {
	
}

class B extends A {
	
}

class C {
	
}
