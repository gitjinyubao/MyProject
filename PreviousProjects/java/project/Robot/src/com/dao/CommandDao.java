package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.entity.Command;
import com.sqlSession.SQlSession;
/**
 *指令表对应的数据库操作
 */
public class CommandDao {
	private SQlSession ss;
	@SuppressWarnings("static-access")
	public List<Command> queryCommandList(Command command){
		List<Command>  list   =new ArrayList<Command>();
		SqlSession sqlSession=null;
		try{
		sqlSession=ss.getSqlSession();
		list=sqlSession.selectList("com.dao.CommandDao.queryCommandList",command);
		}catch(Exception e){
		}finally{
			ss.closeSqlSession(sqlSession);
		}
	    return list;
	}
}
