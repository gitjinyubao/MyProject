package com.sunny.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.sunny.model.Person;

import junit.framework.Assert;

// Person的测试类
public class TestModel {
	
	private static Person p ;
	
	@BeforeClass // 测试类在加载之前就开始执行
	public static void beforeClass() {
		System.out.println("测试类在加载之前就开始执行");
	}
	
	@Before // 测试方法执行之前就执行
	public void innit() {
		System.out.println("初始化对象");
		p = new Person(12, "David");
	}
	
	@Test
	public void showAge() {
		p.showAge();
	}
	
	@Test
	public void showName() {
		p.showName();
	}

	@Test
	public void showAll() {
		p.showAll();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testNameIsAlice() {
		// 断言
		Assert.assertEquals("Alice", p.getName());
	}
	
	@After // 测试方法执行之后执行
	public void destroy() throws InterruptedException {
		System.out.println("请求GC处理对象");
		System.gc(); // 告诉GC进行垃圾收集，不清楚GC是否一定垃圾收集
		p = null;
		System.runFinalization(); // 强制调用已经失去引用的对象的finalize方法
	}
	
	@AfterClass // 测试类在加载之后执行
	public static void afterClass() {
		System.out.println("测试类在摧毁时释放资源开始执行");
	}
}
