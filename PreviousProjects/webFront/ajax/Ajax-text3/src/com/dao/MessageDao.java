package com.dao;

import java.util.List;

import com.entity.Message;

public interface MessageDao {
	public List<Message> selectListMessage(String user_id_friend);
	
	public void insertMessage(Message message);

}
