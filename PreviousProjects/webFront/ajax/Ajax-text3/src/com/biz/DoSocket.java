package com.biz;

import java.util.List;

import com.entity.Message;
import com.entity.User;

public interface DoSocket {
	public List<Message> socket(int userId,int friendId);
	
	public User selectOneById(User user); 
	
	public void insertMessage(Message message,int userId,int friendId);
}
