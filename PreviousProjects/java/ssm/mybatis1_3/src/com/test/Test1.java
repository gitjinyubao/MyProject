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
		//���StudentDao�Ľӿڴ������
		 StudentDao   sd=sqlSession1.getMapper(StudentDao.class);
   	     Student   student=sd.selectStuById(4);
   	     System.out.println(student.toString());
   	     sqlSession1.close();
   	     System.out.println("-----------------------");
   	     
   	     System.out.println("�Ա�������");
	     System.out.println("�༶��ѧ����Ϣ���鿴");
   	     SqlSession   sqlSession2=TestProject.getSqlSession();
   	     ClassesDao   cd=sqlSession2.getMapper(ClassesDao.class);
   	     Classes      cs=cd.selectClaById(1);
   	     System.out.println(cs.toString());
   	     sqlSession2.close();
   	     
   	     //���������شﵽ�����Ż�
   	     System.out.println("ֻ�鿴�༶��Ϣ");
   	     SqlSession   sqlSession3=TestProject.getSqlSession();
   	     ClassesDao   cd1=sqlSession3.getMapper(ClassesDao.class);
	     Classes      cs1=cd1.selectClaById(1);
   	     System.out.println(cs1.printlnAllClass());
   	     sqlSession3.close();
   	     
	}
}
