package com.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dao.impl.UserDaoImpl;
import com.entity.User;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//全部查询
		UesrDao   user=new   UserDaoImpl();
		List<User> list=user.findAll();
		for(User user1:list)
		{
			System.out.println(user1.toString());
		}
		
		//查询的时候定下别名
		User  user2=user.fibdOne(1);
		System.out.println(user2.toString());
		
		//查询的时候不定下别名
		user2=user.fibdOne1(1);
		System.out.println(user2.toString());
		
		//使用ResultMap(解决数据库内的字段名和实体的属性名称不一致的办法)
		User user3=user.findOne2(1);
		System.out.println(user3.toString());
		System.out.println("-----------------");
		
		//使用Map传递多个参数
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("id1", 4);
		map.put("username", "%j%");
		List<User> list1=user.findList(map);
		for(User user1:list1)
		{
			System.out.println(user1.toString());
		}
		
		System.out.println("//使用动态if  sql");
		//使用动态if  sql
		Map<String, Object> map1=new HashMap<String, Object>();
		map1.put("id1", 1);
		map1.put("username", null);
		List<User> list2=user.findList1(map1);
		System.out.println(list2.size());
		for(User user1:list2)
		{
			System.out.println(user1.toString());
		}
		
		
		//choose   when   只会选择第一次符合条件的when语句条件
		System.out.println("choose   when   只会选择第一次符合条件的when语句条件");
		List<User> list3=user.findList2(map1);
		System.out.println(list2.size());
		for(User user1:list3)
		{
			System.out.println(user1.toString());
		}
		
		//set     更新数据的操作
		Map<String, Object>    map2=new HashMap<String, Object>();
		map2.put("username", "jinyubao");
		user.update(map2);
		
		
		//foreach
		List<Integer>   list11=new ArrayList<Integer>();
		list11.add(1);
		list11.add(3);
		list11.add(5);
		List<User>  list12=user.findList3(list11);
		for(User user5:list12)
		{
			System.out.println(user5.toString());
		}
		
	}
}
