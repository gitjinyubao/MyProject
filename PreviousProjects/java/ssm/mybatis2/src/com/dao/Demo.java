package com.dao;

import com.dao.impl.UserDaoImpl;
import com.entity.Role;
import com.entity.User;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDaoImpl   userDao=new UserDaoImpl();
		User  user=new User();
		
		user=userDao.findById(2);
		System.out.println(user.toString());
		System.out.println(user.getRole().getName());
		
		
		Role role=userDao.findById1(1);
		System.out.println(role.toString());
		for(User user2:role.getUsers())
		{
			System.out.println(user2.toString());
		}
	}
}
