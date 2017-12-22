package com.sunny.springbootmybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunny.springbootmybatis.entity.User;
import com.sunny.springbootmybatis.mapper.UserMapper;

@Service
public class UserService{
	// 注入mapper接口代理对象
	@Autowired
	private UserMapper 	userMapper;

	public List<User> findAll() {
		List<User> list = userMapper.findAll();
		return list;
	}
}
