package com.biz;

import java.util.List;

import com.entity.User;

public interface DoLogin {
	public User login(User user);
	
	public List<User> selectList();
}
