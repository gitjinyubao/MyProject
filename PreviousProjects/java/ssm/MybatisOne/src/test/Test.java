package test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Test {
	public  static  void   main(String []   args) throws IOException
	{
		String  dataSource="mybatis.config.xml";
		InputStream   inputStream=Resources.getResourceAsStream(dataSource);
		SqlSessionFactory  sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		System.out.println(sqlSessionFactory);
	}

}
