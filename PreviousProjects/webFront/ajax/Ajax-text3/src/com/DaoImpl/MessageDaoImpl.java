package com.DaoImpl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dao.MessageDao;
import com.entity.Message;
import com.sqlSession.SQlSession;

public class MessageDaoImpl implements MessageDao{

	@Override
	public List<Message> selectListMessage(String user_id_friend) {
		// TODO Auto-generated method stub
		SqlSession sqlSession=SQlSession.getSqlSession();
		MessageDao messageDao=sqlSession.getMapper(MessageDao.class);
		List<Message> list=messageDao.selectListMessage(user_id_friend);
		SQlSession.closeSqlSession(sqlSession);
		return list;
	}

	@Override
	public void insertMessage(Message message) {
		// TODO Auto-generated method stub
		SqlSession sqlSession=SQlSession.getSqlSession();
		MessageDao messageDao=sqlSession.getMapper(MessageDao.class);
		messageDao.insertMessage(message);
		sqlSession.commit();
		SQlSession.closeSqlSession(sqlSession);
	}

}
