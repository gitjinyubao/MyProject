package com.sunny.springbootmybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sunny.springbootmybatis.entity.User;

@Mapper
public interface UserMapper {

	/*
	 * 需求：
	 *    查询所有用户
	 */
	  public List<User> findAll();
}
