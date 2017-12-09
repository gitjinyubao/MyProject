package com.text;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.entity.Student;
import com.entity.StudentsClass;

public class Test1 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ApplicationContext  ac=new  ClassPathXmlApplicationContext("applicationContext.xml");
        @SuppressWarnings("unused")
		Student   stu=(Student)ac.getBean("student");
        @SuppressWarnings("unused")
		StudentsClass   class1=(StudentsClass)ac.getBean("studentsClass");
        
        InputStream    is=Resources.getResourceAsStream("mybatis_config.xml");
        SqlSessionFactory    factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession   sqlsession=factory.openSession();
        
        
        List<Student>   list=sqlsession.selectList("com.mappers.StudentMapper.selectAll");
       
        for(Student   s:list)
        {
              System.out.println(s.toString());
              System.out.println("--------");
              System.out.println(s.getStu_cla().toString());
        }
        sqlsession.close();
        
        SqlSession   sqlsession1=factory.openSession();
        List<StudentsClass>   list1=sqlsession1.selectList("com.mappers.StudentsClass.selectAll");
        for(StudentsClass sc:list1)
        {
        	System.out.println(sc.toString());
        }
	}
}
