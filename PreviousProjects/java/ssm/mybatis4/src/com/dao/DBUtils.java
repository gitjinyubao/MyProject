package com.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBUtils {
	public  static    SqlSessionFactory    sessionFactory;
	static
	{
		try {
			Reader   reader=Resources.getResourceAsReader("mybatis.cfg.xml");
			sessionFactory=new  SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static  SqlSession  getSqlSession()
	{
		return sessionFactory.openSession();
	}
}
