package com.a;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
	
	/*通过@Autowired为List和Map类型的对象集合进行依赖注解
	  可以不写set方法*/
	@Autowired
	private   List<A_interface>  list;
	
	//string 对应的是bean的ID
	@Autowired
	private   Map<String,A_interface>  map;
	
	public   void   say()
	{
		System.out.println("list集合列出bean");
		if(null!=list&&0!=list.size())
		{
			for(A_interface   a:list)
			{
				System.out.println(a.getClass().getName());
			}
		}
		
		
		
		System.out.println("map集合列出bean");
		if(null!=map&&0!=map.size())
		{
			for(Map.Entry<String, A_interface> entry:map.entrySet())
			{
				System.out.println(entry.getKey()+"------"+entry.getValue());
			}
		}
	}
}
