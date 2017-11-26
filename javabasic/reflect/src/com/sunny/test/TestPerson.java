package com.sunny.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;
import com.sunny.model.Person;

/*
 * ������
 * 1.���캯��
 * getConstructor(Class<?>... parameterTypes)
 * getDeclaredConstructor(Class<?>... parameterTypes)
 * getDeclaredConstructors()
 * getConstructors()
 * 
 * 2.����
 * getMethod(String name, Class<?>... parameterTypes)
 * getDeclaredMethod(String name, Class<?>... parameterTypes)
 * getDeclaredMethods() 
 * getMethods()
 * 
 * 3.�ֶ�
 * getField(String name)
 * getDeclaredField(String name)
 * getDeclaredFields(String name)
 * getFields()
 * 
 * 4.ʵ��������
 * newInstance()
 * 
 * 5.���ظ�����������
 * getClassLoader()
 */
public class TestPerson {
	@SuppressWarnings("rawtypes")
	private Class personClass;
	
	// ��ʼ��person����
	@SuppressWarnings("unused")
	@Before
	public void initPerson() throws ClassNotFoundException {
		/*
		 * ������:�õ�����ֽ������
		 */
		// 1.
		personClass = Class.forName("com.sunny.model.Person"); // ������Ӳ���ϵ��ֽ����ļ�ʹ��Class���ֽ������洢���ڴ���
		
		// 2.
		@SuppressWarnings("rawtypes")
		Class p2 = new Person().getClass();
		
		// 3.
		@SuppressWarnings("rawtypes")
		Class p3 = Person.class;
	}
	
	// ������Ĺ��췽��
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void testConstructor() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// ������int���͵ľ�Ҫ��int.class����Ҫ��Integer.class
		Constructor constructorOne = personClass.getConstructor(int.class, String.class); // �õ�public���͵Ĺ��캯��
		Constructor constructorTwo =  personClass.getDeclaredConstructor(int.class); // �õ��������Ĺ��캯��������˽�У�
		constructorTwo.setAccessible(true); // ��������
		
		// ͨ�����캯����ʵ��������
		Person personOne = (Person) constructorOne.newInstance(2, "david");
		System.out.println(personOne.toString());
		
		System.out.println("=========================");
		
		Person personTwo = (Person) constructorTwo.newInstance(3);
		System.out.println(personTwo.toString());
		
		System.out.println("=========================");
		
		// ͨ��class����ֱ�Ӵ�������
		Person personThree = (Person) personClass.newInstance(); // ʵ���Ƿ�������޲ι��캯�����з���
		System.out.println(personThree);
	}
	
	// ������ķ���
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test
	public void testMethod() throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, FileNotFoundException{

		// ���䷽����public void showName(String name)
		Method methodOne  = personClass.getMethod("showName", String.class); // getMethod(String name, Class<?>... parameterTypes)
		methodOne.invoke(personClass.newInstance(), "david"); // invoke(Object obj, Object... args)
		System.out.println("========================");
		
		// ���䷽����public void showName()
		Method methodTwo = personClass.getMethod("showName", null);
		methodTwo.invoke(personClass.newInstance(), null);
		
		// ���䷽���� public Class[] getClassNum(String name, int[] password)
		Method methodThree = personClass.getMethod("getClassNum", String.class, int[].class);
		Class[] classNum = (Class[]) methodThree.invoke(personClass.newInstance(), "hello", new int[] {1 , 2, 3});
		for(Class e : classNum) {
			System.out.println(e.getName());
		}
		
		// ���䷽����private void addInputStream(InputStream in)
		Method methodFour = personClass.getDeclaredMethod("addInputStream", InputStream.class);
		methodFour.setAccessible(true);
		methodFour.invoke(personClass.newInstance(), new FileInputStream("f:\\1.txt"));
		
		// ���䷽���� public static void eat(int num)
		Method methodFive = personClass.getMethod("eat", int.class);
		methodFive.invoke(null, 2); // ��̬�������з����ǲ���Ҫ�����
	}
	
	// ����main����
	@Test
	public void testMainMethod() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method methodFive = personClass.getMethod("main", String[].class);
		methodFive.invoke(null, new Object[] {new String[] {"1", "2"}}); // ��̬�������з����ǲ���Ҫ�����
		methodFive.invoke(null, (Object) new String[] {"1", "2"}); // ��̬�������з����ǲ���Ҫ�����
	}
	
	// �����ֶ�
	/*
	 * private int age;
	 * private String name;
	 * public static String sex;
	 * public int weight;
	 */
	@Test
	public void testFiled() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		Person person = new Person(20, "david", 74, "��");
		String name = null;
		String sex = null;
		int age = 0;
		int weight = 0;
		
		// �õ��ֶ�
		Field f1 = personClass.getDeclaredField("name");
		f1.setAccessible(true);
		
		// �õ��ֶ�ֵ
	    Object objectOne = f1.get(person); // ���ĸ�������ֶ�ֵ,���ص���Object���͵�
	    
	    // �õ��ֶε�����
	    Class classType = f1.getType();
	    
	    // �жϻ�õ��ֶ����ͣ��ٽ�ֵ����ת��
	    if(String.class.equals(classType)) {
	    	name = (String) objectOne;
	    }
	    
	    System.out.println(name);
	    
	    System.out.println("===================================");
	    
	    f1.set(person, "alice");
	    name = (String) f1.get(person); // ���ֶ�����ֵ
	    System.out.println(name);
	}
}
