package com.dao.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.impl.DoDbImpl;
import com.dao1.DoDb;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext   ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		DoDb   d=(DoDb) ac.getBean("ddi");
		d.doDelete();
	}
}
