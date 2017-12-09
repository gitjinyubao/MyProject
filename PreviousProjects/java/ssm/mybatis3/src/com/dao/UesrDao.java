package com.dao;

import java.util.List;
import java.util.Map;


import com.entity.User;

public interface UesrDao {
public List<User> findAll();
public User   fibdOne(int id);
public User   fibdOne1(int id);
public User   findOne2(int id);
public List<User>   findList(Map<String,Object>  map);
public List<User>   findList1(Map<String,Object>  map);
public List<User>   findList2(Map<String,Object>  map);
public void update(Map<String,Object>  map);
public List<User> findList3(List<Integer>   list);
}
