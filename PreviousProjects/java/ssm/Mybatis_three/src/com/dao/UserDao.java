package com.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.entity.User;

public interface UserDao {
	public  List<Map>  findUser(HashMap map);
    public  void deleteUser(int id);
    public  void  insert(User user);
    public  void  update(Map   map);
    public  List<User>  select(int  curreentPage,int size);
}
