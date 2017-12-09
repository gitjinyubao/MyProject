package com.dao.impl;

import org.apache.ibatis.session.SqlSession;

import com.dao.DBUtils;
import com.dao.UserDao;
import com.entity.Role;
import com.entity.User;

public class UserDaoImpl implements UserDao {
	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		SqlSession  session=DBUtils.getSqlSession();
        User   user=session.selectOne("mapper.UserMapper.findById",id);
        session.close();
        return user;
	}

	@Override
	public Role findById1(int id) {
		// TODO Auto-generated method stub
		SqlSession  session=DBUtils.getSqlSession();
        Role   role=session.selectOne("mapper.RoleMapper.findById1",id);
		return role;
	}
}
