package test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.dao.impl.UesrDaoImpl;
import com.entity.User;

public class Test1 {
    @Test
	public void  testDelete()
	{
    	  UesrDaoImpl   userDaoImpl = new UesrDaoImpl();
    	  userDaoImpl.deleteUser(5);
    	  
    	  
	}
    @Test
    public void  testInsert()
	{
    	  UesrDaoImpl   userDaoImpl = new UesrDaoImpl();
    	  User  user=new User(2,null);
    	  userDaoImpl.insert(user);
	}
    @Test
    public void  testSelect()
	{
        HashMap  map=new HashMap();
    	map.put("id", 1);
		map.put("username","bao");
    	  UesrDaoImpl   userDaoImpl = new UesrDaoImpl();
    	  List<Map>   list=(List<Map>) userDaoImpl.findUser(map);
    	  /*for(int i=0;i<list.size();++i)
    	  {
    		  Map   map1=list.get(i);
    		  System.out.println(map1.get("id")+""+map1.get("username"));
    	  }*/
    	  for(Map  map1:list)
    	  {
    		  System.out.println(map1.get("id")+""+map1.get("username"));
    	  }
	}
    
    
    @Test
    public  void  testUpdate()
    {
    	Map   map=new HashMap();
    	map.put("id1", 5);
    	map.put("username", "jinyu");
    	UesrDaoImpl   userDaoImpl = new UesrDaoImpl();
    	userDaoImpl.update(map);
    }
    
    
    @Test
    public void  testSelectFen()
    {
    	//实现分页查询
    	UesrDaoImpl   userDaoImpl = new UesrDaoImpl();
    	List<User>   list=userDaoImpl.select(2,2);
    	for(User user:list)
    	{
    		System.out.println(user.toString());
    	}
    }
}
