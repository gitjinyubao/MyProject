package com.dao;

import com.entity.User;

public interface UserDao {
	public   User     selectUser(User   user);
	public   User     selectUserUsername(String  username);
	public   void     insertUser(User   user);

}
