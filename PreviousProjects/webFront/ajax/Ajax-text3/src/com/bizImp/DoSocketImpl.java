package com.bizImp;

import java.util.ArrayList;
import java.util.List;

import com.DaoImpl.MessageDaoImpl;
import com.DaoImpl.UserDaoImpl;
import com.biz.DoSocket;
import com.dao.MessageDao;
import com.dao.UserDao;
import com.entity.Message;
import com.entity.User;

public class DoSocketImpl implements DoSocket {
	private MessageDao messageDao;
	private UserDao userDao;
	@Override
	public List<Message> socket(int userId,int friendId) {
		// TODO Auto-generated method stub
		//²éÑ¯Í¨ÐÅ
		messageDao=new MessageDaoImpl();
		List<Message> list=new ArrayList<Message>();
		String user_id_friend=String.valueOf(friendId)+"_"+String.valueOf(userId);
		list=messageDao.selectListMessage(user_id_friend);
		String user_id_friend1=String.valueOf(userId)+"_"+String.valueOf(friendId);
		list.addAll(messageDao.selectListMessage(user_id_friend1));
		return list;
	}
	@Override
	public User selectOneById(User user) {
		// TODO Auto-generated method stub
		userDao=new UserDaoImpl();
		return userDao.selectOneById(user);
	}
	@Override
	public void insertMessage(Message message, int userId, int friendId) {
		// TODO Auto-generated method stub
		messageDao=new MessageDaoImpl();
		if(null!=message.getMessage()){
			  String user_id_friend=String.valueOf(friendId)+"_"+String.valueOf(userId);
			  message.setUser_id_friend(user_id_friend);
		      messageDao.insertMessage(message);
		}
	}
}
