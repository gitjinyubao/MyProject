package com.test;

import java.io.IOException;
import java.io.InputStream;



import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("unused")
public class TestProject {
	private static   SqlSessionFactory   factory;
	public static   ApplicationContext  ac;
	static
	{
		try {
			InputStream    is=Resources.getResourceAsStream("mybatis_config.xml");
			factory=new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	static 
	{
		   ApplicationContext   ac=new ClassPathXmlApplicationContext("classpath:ApplicationContext.xml");   
	}
	public   static   SqlSession    getSqlSession()
	{
		SqlSession    sqlSession=null;
		sqlSession=factory.openSession();
		return  sqlSession;
	}
}
