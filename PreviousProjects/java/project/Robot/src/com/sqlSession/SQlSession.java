package com.sqlSession;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
/**
 * ����SqlSession��,�ṩ���SqlSession�ķ���
 */
public class SQlSession {
	//���徲̬˽��SqlSessionFactory���͵ĳ�Ա����
	private static SqlSessionFactory factory;
    	
	//��̬������,�����ʼ����ʱ���ִ��
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
	
	//���ⲿ�ṩ��װ�õĻ��sqlSession�ķ���
	public static SqlSession getSqlSession(){
		return factory.openSession();
	}
	
	//���ⲿ�ṩ�ر�SqlSession
	public static void closeSqlSession(SqlSession sqlSession){
		if(null!=sqlSession){
			sqlSession.close();
		}
	}
}
