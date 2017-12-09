package com.dao;

//import java.util.List;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.dao.impl.UesrDaoImpl;
import com.entity.User;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   UesrDaoImpl   userDaoImpl = new UesrDaoImpl();
		 //  User  user=userDaoImpl.findUser(2);
		   //System.out.println(user.toString());
		   
		   
		  /* HashMap  map=new HashMap();
	    	map.put("id", 1);
			map.put("username", "a");
	    	  List<Map>   list=(List<Map>) userDaoImpl.findUser(map);
	    	  for(int i=0;i<list.size();++i)
	    	  {
	    		  Map   map1=list.get(i);
	    		  System.out.println(map1.get("id")+""+map1.get("username"));
	    	  }*/
		   
		   
		   
		   /*System.out.println("-------------");
		   userDaoImpl.deleteUser(1);
		   System.out.println("-------------");
		   User  user1=new User(3,"bao");
	    	  userDaoImpl.insert(user1);*/
	    	  
	    	  Map   map=new HashMap();
	      	map.put("id1", 4);
	      	User   user=new User(5,"jingyu");
	      	map.put("User", user);
	      	userDaoImpl.update(map);
	}
}
