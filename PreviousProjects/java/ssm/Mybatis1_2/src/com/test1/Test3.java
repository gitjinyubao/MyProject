package com.test1;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dao.IdCardDao;
import com.dao.PersonDao;
import com.entity.IdCard;
import com.entity.Person;

public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
