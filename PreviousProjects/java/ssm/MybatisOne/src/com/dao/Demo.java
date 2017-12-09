package com.dao;

import java.util.List;

import com.dao.impl.UserDaoImpl;
import com.entity.User;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   UserDaoImpl   userDaoImpl = new UserDaoImpl();
	   List<User>  list=userDaoImpl.listUser();
	   for(User  u:list)
	   {
		   System.out.println(u.toString());
	   }
	   

	}

}
