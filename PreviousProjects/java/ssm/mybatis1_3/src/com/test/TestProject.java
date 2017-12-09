package com.test;

import java.io.IOException;
import java.io.InputStream;



import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestProject {
      private   static   SqlSessionFactory    factory;
      @SuppressWarnings("unused")
	private   static   ApplicationContext   ac;
      
      static  
      {
    	  try {
			InputStream   is=Resources.getResourceAsStream("mybatis_config.xml");
			factory=new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
      
      static 
      {
    	  ac=new  ClassPathXmlApplicationContext("classpath:applicationContext.xml");
      }
      
      public static  SqlSession    getSqlSession()
      {
    	  SqlSession  sqlSession;
    	  sqlSession=factory.openSession();
    	  return   sqlSession; 
      }
      
     /* @Test
      public   void  testProject()
      {
    	  StudentDao   sd=TestProject.getSqlSession().getMapper(StudentDao.class);
    	  Student   student=sd.selectStuById(1);
    	  System.out.println(student.toString());
      }*/
}
