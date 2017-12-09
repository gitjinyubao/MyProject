package com.cjg.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.cjg.spring.NewStudent;
import com.cjg.spring.NewStudentManager;



public class TestAdd {
    @Test
	public   void    TestAdd()
	{
    	
    	ApplicationContext  ac=new ClassPathXmlApplicationContext("config.xml");
		//ApplicationContext    ac=new   FileSystemXmlApplicationContext("/WebRoot/WEB-INF/classes/config.xml");
    	NewStudentManager   ns=(NewStudentManager)ac.getBean("newStudent");          //    /WebRoot/WEB_INF/classes/config.xml
		ns.addStudent();
	}

}
