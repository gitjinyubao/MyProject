package com.dao;

import java.util.List;

import com.entity.User;

public interface UserDao {
	
	public User selectOne(User user);
	
	public User selectOneById(User user);
	
	public List<User> selectList();
	
}
