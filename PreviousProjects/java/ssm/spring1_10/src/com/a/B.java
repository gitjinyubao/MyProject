package com.a;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
	
	/*ͨ��@AutowiredΪList��Map���͵Ķ��󼯺Ͻ�������ע��
	  ���Բ�дset����*/
	@Autowired
	private   List<A_interface>  list;
	
	//string ��Ӧ����bean��ID
	@Autowired
	private   Map<String,A_interface>  map;
	
	public   void   say()
	{
		System.out.println("list�����г�bean");
		if(null!=list&&0!=list.size())
		{
			for(A_interface   a:list)
			{
				System.out.println(a.getClass().getName());
			}
		}
		
		
		
		System.out.println("map�����г�bean");
		if(null!=map&&0!=map.size())
		{
			for(Map.Entry<String, A_interface> entry:map.entrySet())
			{
				System.out.println(entry.getKey()+"------"+entry.getValue());
			}
		}
	}
}
