package com.sunny.springbootmybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunny.springbootmybatis.entity.User;
import com.sunny.springbootmybatis.service.UserService;

@RestController
public class UserController {
	
	// 注入service对象
	@Autowired
	private UserService userService;
	
	/*
	 * 需求：
	 *     整合ssm
	 */
	@RequestMapping("ssm")
    public List<User> findAll(){
    	List<User> list = userService.findAll();
    	return list;
    }
}
