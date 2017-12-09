package com.DaoImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dao.UserDao;
import com.entity.User;
import com.sqlSession.SQlSession;

public class UserDaoImpl implements UserDao{

	@Override
	public User selectOne(User user) {
		// TODO Auto-generated method stub
		SqlSession sqlSession=SQlSession.getSqlSession();
		UserDao userDao=sqlSession.getMapper(UserDao.class);
		User userNow=userDao.selectOne(user);
		SQlSession.closeSqlSession(sqlSession);
		return userNow;
	}

	@Override
	public List<User> selectList() {
		// TODO Auto-generated method stub
		SqlSession sqlSession=SQlSession.getSqlSession();
		UserDao userDao=sqlSession.getMapper(UserDao.class);
		List<User> list=userDao.selectList();
		SQlSession.closeSqlSession(sqlSession);
		return list;
	}

	@Override
	public User selectOneById(User user) {
		// TODO Auto-generated method stub
		SqlSession sqlSession=SQlSession.getSqlSession();
		UserDao userDao=sqlSession.getMapper(UserDao.class);
		User userFriend=userDao.selectOneById(user);
		SQlSession.closeSqlSession(sqlSession);
		return userFriend;
	}

}
