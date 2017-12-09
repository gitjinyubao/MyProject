package com.test1;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.IdCardDao;
import com.dao.PersonDao;
import com.entity.IdCard;
import com.entity.Person;

public class Test4 {
	public   static   SqlSessionFactory    factory;
	public   static   ApplicationContext    ac;
	static
	{
		try {
			InputStream    is=Resources.getResourceAsStream("mybatis_config.xml");
			factory  =new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static
	{
		ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		
	}
	public  static  SqlSession    getSqlSession()
	{
		SqlSession    sqlsession=null;
		sqlsession=factory.openSession();
		return   sqlsession;
	}
	
	
	
	@Test
	public   void   test1()
	{
		SqlSession   sqlSession=Test2.getSqlSession();
		PersonDao    personDao=sqlSession.getMapper(PersonDao.class);
		List<Person>  list1=personDao.selectAllPerson();
		for(Person   p:list1)
		{
			System.out.println(p.toString());
		}
		sqlSession.close();
		SqlSession   sqlSession1=Test2.getSqlSession();
		IdCardDao    idCardDao=sqlSession1.getMapper(IdCardDao.class);
		List<IdCard>   list2=idCardDao.selectAllIdCard();
		for(IdCard   id:list2)
		{
			System.out.println(id.toString());
		}
	}

}
