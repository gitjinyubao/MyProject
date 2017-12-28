package com.sunny.MyDemo.Controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunny.MyDemo.entity.User;

@RestController // 代替了 @Controller和@ResponseBody导致返回值直接就是json格式的
public class UserController {

	/*
	 * 需求：
	 *    返回基本类型的json数据
	 */
	@RequestMapping("hello")
	public String helloWord() {
		return "hello word";
	}
	
	/*
	 * 需求：
	 *     返回一个pojo对象(json格式)
	 */
	@RequestMapping("pojo")
	public User showUser() {
		User user = new User(123, "david", new Date(), "man");
		
		return user;
	}
	
	/*
	 * 需求：
	 *    返回集合类型(json格式)
	 */
	@RequestMapping("collection")
	public Map<Integer, Object> getNames() {
		Map<Integer, Object> map = new HashMap<>();
		map.put(0, "david");
		map.put(1, "alice");
		map.put(2, "jorge");
		
		return map;
	}
	
	/*
	 * 需求：
	 *    返回list集合对象
	 */
	@RequestMapping("list")
	public List<User> getUser() {
		User user1 = new User(1, "david", new Date(), "man");
		User user2 = new User(2, "david", new Date(), "man");
		User user3 = new User(3, "david", new Date(), "man");
		List<User> list = new ArrayList<>();
		list.add(user1);
		list.add(user2);
		list.add(user3);
		
		return list;
	}
}
