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
 * 解剖类
 * 1.构造函数
 * getConstructor(Class<?>... parameterTypes)
 * getDeclaredConstructor(Class<?>... parameterTypes)
 * getDeclaredConstructors()
 * getConstructors()
 * 
 * 2.方法
 * getMethod(String name, Class<?>... parameterTypes)
 * getDeclaredMethod(String name, Class<?>... parameterTypes)
 * getDeclaredMethods() 
 * getMethods()
 * 
 * 3.字段
 * getField(String name)
 * getDeclaredField(String name)
 * getDeclaredFields(String name)
 * getFields()
 * 
 * 4.实例化对象
 * newInstance()
 * 
 * 5.返回该类的类加载器
 * getClassLoader()
 */
public class TestPerson {
	@SuppressWarnings("rawtypes")
	private Class personClass;
	
	// 初始化person对象
	@SuppressWarnings("unused")
	@Before
	public void initPerson() throws ClassNotFoundException {
		/*
		 * 加载类:得到类的字节码对象
		 */
		// 1.
		personClass = Class.forName("com.sunny.model.Person"); // 将类在硬盘上的字节码文件使用Class的字节码对象存储在内存中
		
		// 2.
		@SuppressWarnings("rawtypes")
		Class p2 = new Person().getClass();
		
		// 3.
		@SuppressWarnings("rawtypes")
		Class p3 = Person.class;
	}
	
	// 反射类的构造方法
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public void testConstructor() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// 参数是int类型的就要用int.class而不要用Integer.class
		Constructor constructorOne = personClass.getConstructor(int.class, String.class); // 得到public类型的构造函数
		Constructor constructorTwo =  personClass.getDeclaredConstructor(int.class); // 得到类声明的构造函数（包括私有）
		constructorTwo.setAccessible(true); // 暴力反射
		
		// 通过构造函数，实例化对象
		Person personOne = (Person) constructorOne.newInstance(2, "david");
		System.out.println(personOne.toString());
		
		System.out.println("=========================");
		
		Person personTwo = (Person) constructorTwo.newInstance(3);
		System.out.println(personTwo.toString());
		
		System.out.println("=========================");
		
		// 通过class对象直接创建对象
		Person personThree = (Person) personClass.newInstance(); // 实质是反射类的无参构造函数进行反射
		System.out.println(personThree);
	}
	
	// 反射类的方法
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test
	public void testMethod() throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, FileNotFoundException{

		// 反射方法：public void showName(String name)
		Method methodOne  = personClass.getMethod("showName", String.class); // getMethod(String name, Class<?>... parameterTypes)
		methodOne.invoke(personClass.newInstance(), "david"); // invoke(Object obj, Object... args)
		System.out.println("========================");
		
		// 反射方法：public void showName()
		Method methodTwo = personClass.getMethod("showName", null);
		methodTwo.invoke(personClass.newInstance(), null);
		
		// 反射方法： public Class[] getClassNum(String name, int[] password)
		Method methodThree = personClass.getMethod("getClassNum", String.class, int[].class);
		Class[] classNum = (Class[]) methodThree.invoke(personClass.newInstance(), "hello", new int[] {1 , 2, 3});
		for(Class e : classNum) {
			System.out.println(e.getName());
		}
		
		// 反射方法：private void addInputStream(InputStream in)
		Method methodFour = personClass.getDeclaredMethod("addInputStream", InputStream.class);
		methodFour.setAccessible(true);
		methodFour.invoke(personClass.newInstance(), new FileInputStream("f:\\1.txt"));
		
		// 反射方法： public static void eat(int num)
		Method methodFive = personClass.getMethod("eat", int.class);
		methodFive.invoke(null, 2); // 静态方法进行反射是不需要对象的
	}
	
	// 反射main方法
	@Test
	public void testMainMethod() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Method methodFive = personClass.getMethod("main", String[].class);
		methodFive.invoke(null, new Object[] {new String[] {"1", "2"}}); // 静态方法进行反射是不需要对象的
		methodFive.invoke(null, (Object) new String[] {"1", "2"}); // 静态方法进行反射是不需要对象的
	}
	
	// 反射字段
	/*
	 * private int age;
	 * private String name;
	 * public static String sex;
	 * public int weight;
	 */
	@Test
	public void testFiled() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InstantiationException {
		Person person = new Person(20, "david", 74, "男");
		String name = null;
		String sex = null;
		int age = 0;
		int weight = 0;
		
		// 得到字段
		Field f1 = personClass.getDeclaredField("name");
		f1.setAccessible(true);
		
		// 得到字段值
	    Object objectOne = f1.get(person); // 得哪个对象的字段值,返回的是Object类型的
	    
	    // 得到字段的类型
	    Class classType = f1.getType();
	    
	    // 判断获得的字段类型，再将值进行转化
	    if(String.class.equals(classType)) {
	    	name = (String) objectOne;
	    }
	    
	    System.out.println(name);
	    
	    System.out.println("===================================");
	    
	    f1.set(person, "alice");
	    name = (String) f1.get(person); // 给字段设置值
	    System.out.println(name);
	}
}
