package com.service;


import com.dao.MessageDao;

public class DeleteOneService {
	public void deleteOne(int id){
		MessageDao messageDao=new MessageDao();
		messageDao.deleteOne(id);
	}
}
