package com.dao.impl;

import com.dao.UserDao;

public class UserDaoImpl1 implements UserDao {

	@Override
	public void delete() {
		// TODO Auto-generated method stub
          System.out.println("ʵ��ɾ��");
	}

	@Override
	public void updata() {
		// TODO Auto-generated method stub
		 System.out.println("ʵ���޸�");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub
		 System.out.println("ʵ�ֲ���");
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		 System.out.println("ʵ�ֲ���");
	}

	public UserDaoImpl1() {
		super();
		System.out.println("���췽��ִ��");
		// TODO Auto-generated constructor stub
	}
}
