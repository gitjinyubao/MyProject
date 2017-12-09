package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.entity.Message;
import com.sqlSession.SQlSession;

/**
 * 对Message表进行的数据库操作
 */
public class MessageDao {
	private SQlSession  ss;
	/**
	 * 根据查询条件查询消息列表
	 * 处理Message表的查询，回馈信息给list_news.jsp页面
	 */
	@SuppressWarnings("static-access")
	public List<Message> queryListMessage(Message message){
		List<Message>  list   =new ArrayList<Message>();
		SqlSession sqlSession=null;
		try{
		sqlSession=ss.getSqlSession();
		list=sqlSession.selectList("com.dao.MessageDao.queryListMessage",message);
		}catch(Exception e){
		}finally{
			ss.closeSqlSession(sqlSession);
		}
	    return list;
	}
	/**
	 * 信息单条删除
	 */
	@SuppressWarnings("static-access")
	public void deleteOne(int id){
		SqlSession sqlSession=null;
		try{
			sqlSession=ss.getSqlSession();
			sqlSession.delete("com.dao.MessageDao.deleteOne", id);
			sqlSession.commit();
		   }catch (Exception e) {
			// TODO: handle exception
		}finally{
			ss.closeSqlSession(sqlSession);
		}
	}
	/**
	 * 信息批量删除
	 */
	public void deleteBatch(List<Integer> list){
		SqlSession sqlSession=null;
		try{
			sqlSession=ss.getSqlSession();
			sqlSession.delete("com.dao.MessageDao.deleteBatch", list);
			sqlSession.commit();
		}catch (Exception e) {
			// TODO: handle exception
		}finally{
			sqlSession.close();
		}
	}
}
