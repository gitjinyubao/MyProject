package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.entity.Message;
import com.sqlSession.SQlSession;

/**
 * ��Message����е����ݿ����
 */
public class MessageDao {
	private SQlSession  ss;
	/**
	 * ���ݲ�ѯ������ѯ��Ϣ�б�
	 * ����Message��Ĳ�ѯ��������Ϣ��list_news.jspҳ��
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
	 * ��Ϣ����ɾ��
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
	 * ��Ϣ����ɾ��
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
