package com.dao;

//import java.util.List;

import com.dao.impl.UesrDaoImpl;
import com.entity.User;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   UesrDaoImpl   userDaoImpl = new UesrDaoImpl();
		   User  user=userDaoImpl.findUser(1);
		   System.out.println(user.toString());
		   System.out.println("-------------");
		   User   user1=new  User();
		   user1.setId(1);
		   userDaoImpl.deleteUser(user1);
	}
}
