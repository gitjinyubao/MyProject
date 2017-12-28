package test;

import java.util.ArrayList;
import java.util.Collection;

/*
 * ���͸߼�(ͨ���)
 * ��: �������ͣ����û��ȷ������Object�����java������
 * �� Extends E:
 * ? super E:
 */
public class GenericWildcards {
	
	// ���������ȷ��д��ʱ��ǰ�����һ��
	/*Collection<Object> c1 = new ArrayList<Object>();
	Collection<Object> c2 = new ArrayList<B>();
	Collection<Object> c3 = new ArrayList<C>();*/

	// ����ʾ��������Ͷ��ǿ��Ե�
	Collection<?> cc1 = new ArrayList<Object>();
	Collection<?> cc2 = new ArrayList<B>();
	Collection<?> cc3 = new ArrayList<C>();
	
	// �� extends E �����޶���E��������
	Collection<? extends B> ccc1 = new ArrayList<B>();
	
	// ? super E �����޶��� E���丸��
	Collection<? super B> ccc2 = new ArrayList<B>();
	Collection<? super B> ccc3 = new ArrayList<A>();
}

class A {
	
}

class B extends A {
	
}

class C {
	
}
