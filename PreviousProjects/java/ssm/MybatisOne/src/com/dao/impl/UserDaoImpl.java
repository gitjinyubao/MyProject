package com.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;





import com.dao.DBUtils;
import com.dao.UserDao;
import com.entity.User;

public class UserDaoImpl implements UserDao {

	@Override
	public List<User> listUser() {
		SqlSession   sqlSession=DBUtils.getSqlSession();
		List<User>   list=sqlSession.selectList("com.dao.UserMapper.listUser");
		sqlSession.close();
		return list;
	}
}
