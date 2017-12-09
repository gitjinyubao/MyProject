package com.dao.impl;

import com.dao.UserDao;

public class UserDaoImpl1 implements UserDao {

	@Override
	public void delete() {
		// TODO Auto-generated method stub
          System.out.println("实现删除");
	}

	@Override
	public void updata() {
		// TODO Auto-generated method stub
		 System.out.println("实现修改");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		 System.out.println("实现插入");
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		 System.out.println("实现查找");
	}

	public UserDaoImpl1() {
		super();
		System.out.println("构造方法执行");
		// TODO Auto-generated constructor stub
	}
}
