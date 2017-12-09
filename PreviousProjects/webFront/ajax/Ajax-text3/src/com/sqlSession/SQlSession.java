package com.sqlSession;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
/**
 * 定义SqlSession类,提供获得SqlSession的方法
 */
public class SQlSession {
	//定义静态私有SqlSessionFactory类型的成员变量
	private static SqlSessionFactory factory;
    	
	//静态方法块,在类初始化的时候就执行
	static{
			InputStream is;
			try {
				is = Resources.getResourceAsStream("com/config/configulation.xml");
				factory=new SqlSessionFactoryBuilder().build(is);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	//向外部提供封装好的获得sqlSession的方法
	public static SqlSession getSqlSession(){
		return factory.openSession();
	}
	
	//向外部提供关闭SqlSession
	public static void closeSqlSession(SqlSession sqlSession){
		if(null!=sqlSession){
			sqlSession.close();
		}
	}
}
