package com.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBUtils {
	private   static    SqlSessionFactory    ssf;
	private   static    String   resource="mybatis.config.xml";
	private   static     ThreadLocal<SqlSession>   t=new ThreadLocal<SqlSession>();
	//��̬��Ա��������ֱ��������һ����������ֱ��ʹ��
	static
	{
		try {
			if(ssf==null)
			{
				InputStream    is=Resources.getResourceAsStream(resource);
				ssf=new SqlSessionFactoryBuilder().build(is);
			}
			else
			{
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static   SqlSession    getSqlSession()
	{
		   
		    SqlSession    sqlSession=t.get();
		    if(sqlSession==null)
		    {
		    	sqlSession=ssf.openSession();
		    	t.set(sqlSession);
		    }
		    else
		    {
		    	
		    }
		    return  sqlSession;
	}
	public  static   void   doCommit()
	{
		
		if(t.get()!=null)
		{
			t.get().commit();
			t.get().close();
			t.set(null);
			System.out.println("�ύ���ҹر�");
		}
	}
	
	public   static   void   doRollback()
	{
		if(t.get()!=null)
		{
			t.get().rollback();
			t.get().close();
			t.set(null);
			System.out.println("�ع���");
		}
	}
	

}
