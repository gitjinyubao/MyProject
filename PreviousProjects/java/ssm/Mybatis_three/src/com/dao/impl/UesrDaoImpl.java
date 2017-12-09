package com.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import com.dao.DBUtil;
import com.dao.UserDao;
import com.entity.User;

public class UesrDaoImpl implements UserDao {
	DBUtil  d=new DBUtil();

	@Override
	public List<Map> findUser(HashMap map) {
		SqlSession   sqlSession=DBUtil.getSqlSession();
		List<Map> list=sqlSession.selectList("com.dao.UserMapper.select", map);//com.dao.UserMapper.listUser
		sqlSession.commit();
		sqlSession.close();
		return list;
	}
	@Override
	public void deleteUser(int  id) {
		// TODO Auto-generated method stub
		 SqlSession   sqlSession=DBUtil.getSqlSession();
		 /*if(1==1)
		 {*/
		
			
			/* try
			 {*/
				 sqlSession.delete("com.dao.UserMapper.delete",id);
				 sqlSession.commit();
				 //sqlSession.rollback();
			 //}
			 /*catch(Exception  e)
			 {
				 //sqlSession.rollback();
				 System.out.println("´íÎó");
			 }*/
			
			 
			 sqlSession.close();
		/* }
			*/
	}
	 
	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		 SqlSession   sqlSession=DBUtil.getSqlSession();
		 sqlSession.update("com.dao.UserMapper.insert", user);
		 sqlSession.commit();
		 sqlSession.close();
		 
	}
	@Override
	public void update(Map map) {
		// TODO Auto-generated method stub
		SqlSession   sqlSession=DBUtil.getSqlSession();
		 sqlSession.update("com.dao.UserMapper.update", map);
		 sqlSession.commit();
		 sqlSession.close();
	}
	@Override
	public List<User> select(int curreentPage,int size) {
		// TODO Auto-generated method stub
		int curreent=(curreentPage-1)*size;
		SqlSession   sqlSession=DBUtil.getSqlSession();
		 List<User>  list=sqlSession.selectList("com.dao.UserMapper.select1",null,new RowBounds(curreent,size));
		return  list;
	}
}
