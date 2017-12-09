package com.service;

import java.util.ArrayList;
import java.util.List;

import com.dao.MessageDao;

public class DeleteBatchService {
	public void deleteBatch(String [] ids){
		List<Integer> list=new ArrayList<Integer>();
		MessageDao messageDao=new MessageDao();
		if(null!=ids&&ids.length>0){
		for (String string : ids) {
			list.add(Integer.parseInt(string));
		}
		messageDao.deleteBatch(list);
		}
		else{
			
		}
	}
}
