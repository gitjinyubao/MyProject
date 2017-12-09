package com.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dao.DBUtils;
import com.dao.UserDao;
import com.entitty.User;

public class UserDaoImpl implements UserDao {

	@Override
	public List<User> findAll() {
		SqlSession   session=DBUtils.getSession();
		List<User>   list=session.selectList("com.dao.UserMapper.findAll");
		session.close();
		// TODO Auto-generated method stub
		return list;
	}
}
