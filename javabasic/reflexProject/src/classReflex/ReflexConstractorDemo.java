package classReflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * ͨ�������ȡ���췽������ʹ��
 */
public class ReflexConstractorDemo {
    
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		// ��ȡ�ֽ��루class���ļ�����
		Class c = Class.forName("classReflex.Person");
		
		// ��ȡ�޲������췽��
		Constructor ctr1 = c.getConstructor();
		
		// �����޲������췽��
		Person p1 = (Person) ctr1.newInstance(null);
		
		// ��ȡ�в������췽�� ,(�ֽ����ļ�����)
		Constructor ctr2 = c.getConstructor(String.class);
		
		// �����в������췽��
		// ͨ�����������󴴽�����
		Person p2 = (Person) ctr2.newInstance("david");
		
		// ��ȡ���еĹ��췽��
		Constructor[] ctrs = c.getConstructors();
		for (Constructor ctrOne : ctrs) {
			System.out.println(ctrOne);
		}
	
		
		// ��ȡ˽�й��췽��
		Constructor ctr3 = c.getDeclaredConstructor(String.class, String.class);
		// ���ÿɼ���
		ctr3.setAccessible(true);
		// ���ù��캯����ʵ��������
		Person p3 = (Person) ctr3.newInstance("david", "man");
		// ����person�ķ���
		p3.show();

		System.out.println("=====================================");
		
		// ��ȡ��Ա����
		Field[] f1 = c.getFields();
		for (Field ff : f1) {
			System.out.println(ff);
		}

		System.out.println("=====================================");
		Field[] f2 = c.getDeclaredFields();
		for (Field ff : f2) {
			System.out.println(ff);
		}

		System.out.println("=======================================");

		// ��ȡ������Ա����
		Field fieldName = c.getField("name");
		fieldName.set(p3, "alice");
		p3.show();

		System.out.println("=======================================");

		Field fieldSex = c.getDeclaredField("sex");
		fieldSex.setAccessible(true);
		fieldSex.set(p3, "wm");
		p3.show();
		
		System.out.println("=======================================");
		
		// ��ȡ���еķ���
		Method[] methodsOne = c.getMethods(); // ��ȡ�Լ��İ�����������з���
		
		for (Method m : methodsOne) {
			System.out.println(m);
		}
		
		System.out.println("=======================================");
		
		Method[] methodsTwo = c.getDeclaredMethods(); // ��ȡ�Լ����еķ���
		for (Method m : methodsTwo) {
			System.out.println(m);
		}
		
		System.out.println("=======================================");
		
		// public Method getMethod(String name,Class<?>... parameterTypes)
		// public Object invoke(Object obj,Object... args)
	    // ��ȡ�������������ҵ���
		Method mOne = c.getMethod("show");
        mOne.invoke(p3);
        
        System.out.println("=======================================");
        
        Method mTwo = c.getDeclaredMethod("printName", String.class);
        mTwo.setAccessible(true);
        mTwo.invoke(p3, "hello word");
        
	}
}
