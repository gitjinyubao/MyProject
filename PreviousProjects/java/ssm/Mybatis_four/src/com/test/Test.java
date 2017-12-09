package com.test;

import java.util.List;

import com.dao.UserImpl;
import com.entity.User;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User   u=new  User(15,"jjj");
		UserImpl   ui=new UserImpl();
		ui.doInsert(u);
		User   u1=new  User(16,"jj");
		ui.doInsert(u1);
		User   u2=new  User(17,"j");
		ui.doInsert(u2);
		
		
		System.out.println("----------------------");
		
		
		List<User>  list=ui.doSelect();
		for(User   ur:list)
		{
			System.out.println(ur.toString());
		}
	}

}
