package com.test;

import org.apache.ibatis.session.SqlSession;

import com.dao.ClassesDao;
import com.dao.StudentDao;
import com.entity.Classes;
import com.entity.Student;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SqlSession   sqlSession1=TestProject.getSqlSession();
		//获得StudentDao的接口代理对象
		 StudentDao   sd=sqlSession1.getMapper(StudentDao.class);
   	     Student   student=sd.selectStuById(4);
   	     System.out.println(student.toString());
   	     sqlSession1.close();
   	     System.out.println("-----------------------");
   	     
   	     System.out.println("对比懒加载");
	     System.out.println("班级和学生信息都查看");
   	     SqlSession   sqlSession2=TestProject.getSqlSession();
   	     ClassesDao   cd=sqlSession2.getMapper(ClassesDao.class);
   	     Classes      cs=cd.selectClaById(1);
   	     System.out.println(cs.toString());
   	     sqlSession2.close();
   	     
   	     //利用懒加载达到性能优化
   	     System.out.println("只查看班级信息");
   	     SqlSession   sqlSession3=TestProject.getSqlSession();
   	     ClassesDao   cd1=sqlSession3.getMapper(ClassesDao.class);
	     Classes      cs1=cd1.selectClaById(1);
   	     System.out.println(cs1.printlnAllClass());
   	     sqlSession3.close();
   	     
	}
}
