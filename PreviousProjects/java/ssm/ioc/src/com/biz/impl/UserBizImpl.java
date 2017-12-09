package com.biz.impl;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.biz1.UserBiz;
import com.dao.UserDao;

public class UserBizImpl implements UserBiz {
	//这是一个接口的引用，它负责接容器注入进来的实现类的对象
	private UserDao  userDao;
	private String   name;
	private List<String>  list;
	private Set<String>  set;
	private  Properties  props;
    private  Map  map;
    
    
	public UserBizImpl() {
		super();
		System.out.println("实现构造函数1");
		// TODO Auto-generated constructor stub
	}

	public void setMap(Map map) {
		this.map = map;
	}
	
	public void setProps(Properties props) {
		this.props = props;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	public void setSet(Set<String> set) {
		this.set = set;
	}


	public void setList(List<String> list) {
		this.list = list;
	}


	//容器通过这个方法实现对象的注入
	public void setUserDao(UserDao   userDao)
	{
		System.out.println("......................");
		this.userDao=userDao;
	}
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("调用biz中的delete方法");
		System.out.println(name);
		System.out.println(list);
		System.out.println(map);
		System.out.println(set);
		userDao.delete();

	}

	public UserBizImpl(UserDao userDao, String name, List<String> list,
			Set<String> set, Properties props, Map map) {
		super();
		this.userDao = userDao;
		this.name = name;
		this.list = list;
		this.set = set;
		this.props = props;
		this.map = map;
	}//初始化注入方式（byname通过set后的名字与Bean相同）

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void select() {
		// TODO Auto-generated method stub

	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sale(int price) {
		// TODO Auto-generated method stub
		System.out.println("一部"+price+"手机"+"手机套");
	}

}
