package com.dao;

import java.io.IOException;
import java.io.Reader;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBUtils {
	private static SqlSessionFactory  factory;
static
{
	try {
		Reader  reader=Resources.getResourceAsReader("mybatis.cfg.xml");
		factory=new SqlSessionFactoryBuilder().build(reader);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

public static   SqlSession    getSession()
{
	return factory.openSession();
}
}
