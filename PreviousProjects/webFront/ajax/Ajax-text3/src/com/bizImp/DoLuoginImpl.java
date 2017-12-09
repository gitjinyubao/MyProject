package com.bizImp;

import java.util.List;

import com.DaoImpl.UserDaoImpl;
import com.biz.DoLogin;
import com.dao.UserDao;
import com.entity.User;

public class DoLuoginImpl implements DoLogin {

	private UserDao userDao;
	
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		userDao=new UserDaoImpl();
        user=userDao.selectOne(user);
        return user;
	}
	@Override
	public List<User> selectList() {
		// TODO Auto-generated method stub
		userDao=new UserDaoImpl();
		return userDao.selectList();
	}
}
