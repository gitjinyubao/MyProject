package com.dao;

import com.entity.Role;
import com.entity.User;

public interface UserDao {
	public   User findById(int id);
	public   Role findById1(int id);
                             
}
