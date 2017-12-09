package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dao.impl.UserDaoImpl;
import com.entitty.User;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDao  userDao=new UserDaoImpl();
		List<User>   list=userDao.findAll();
		for(User   user:list)
		{
			System.out.println(user.toString());
		}

	}

}
