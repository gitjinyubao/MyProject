package com.dao;

import java.util.List;

import com.entity.User;

public class UserImpl {
	public  void   doInsert(User   u)
	{
		try
		{
		DBUtils.getSqlSession().insert("insert", u);
		}
		catch(Exception  e)
		{
			DBUtils.doRollback();
		}
		finally//finally�飬Ҫ��Try  catch����ʹ��
		{
			DBUtils.doCommit();
		}
		
	}
	public   List<User>   doSelect()
	{
		
			List<User>   list=   DBUtils.getSqlSession().selectList("select");
			return list;

	
	}

}
