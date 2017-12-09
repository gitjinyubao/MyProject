package com.dao.impl;

import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.dao.DBUtil;
import com.dao.UserDao;
import com.entity.User;

public class UesrDaoImpl implements UserDao {

	@Override
	public User findUser(int  id) {
		SqlSession   sqlSession=DBUtil.getSqlSession();
		User  user=sqlSession.selectOne("com.dao.UserMapper.listUser", id);
		sqlSession.close();
		return user;
	}
	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		 SqlSession   sqlSession=DBUtil.getSqlSession();
		 if(1==1)
		 {
			 sqlSession.delete("com.dao.UserMapper.delete", user);
			 System.out.println("11111111111111sss");
		 }
			
	}
}
