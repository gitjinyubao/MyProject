package com.sunny.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.sunny.model.Person;

import junit.framework.Assert;

// Person�Ĳ�����
public class TestModel {
	
	private static Person p ;
	
	@BeforeClass // �������ڼ���֮ǰ�Ϳ�ʼִ��
	public static void beforeClass() {
		System.out.println("�������ڼ���֮ǰ�Ϳ�ʼִ��");
	}
	
	@Before // ���Է���ִ��֮ǰ��ִ��
	public void innit() {
		System.out.println("��ʼ������");
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
		// ����
		Assert.assertEquals("Alice", p.getName());
	}
	
	@After // ���Է���ִ��֮��ִ��
	public void destroy() throws InterruptedException {
		System.out.println("����GC�������");
		System.gc(); // ����GC���������ռ��������GC�Ƿ�һ�������ռ�
		p = null;
		System.runFinalization(); // ǿ�Ƶ����Ѿ�ʧȥ���õĶ����finalize����
	}
	
	@AfterClass // �������ڼ���֮��ִ��
	public static void afterClass() {
		System.out.println("�������ڴݻ�ʱ�ͷ���Դ��ʼִ��");
	}
}
