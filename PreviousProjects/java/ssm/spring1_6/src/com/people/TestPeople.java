package com.people;

import java.util.Iterator;
import java.util.Properties;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPeople {
	
	@Test
	public  void testPeople()
	{
		//类中init初始方法在xml配置文件的初始化之后执行
		ApplicationContext   ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		People  people=(People) ac.getBean("people");
		System.out.println(people.getAge());
		System.out.println("------------------------");
		
		
		//properties：
		Iterator   iterator=people.getProperties().keySet().iterator();
		while(iterator.hasNext())
		{
			Object key=iterator.next();
			Object value=people.getProperties().get(key);
			System.out.println("key"+key+"value"+value);
		}
	}
	
}
