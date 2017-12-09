package com.service;

import java.util.ArrayList;
import java.util.List;

import com.dao.MessageDao;
import com.entity.Message;
import com.util.Iconst;

/**
 * 列表相关的业务功能
 */
public class ListMessageService {
	/**
	 *页面信息列表
	 */
	public List<Message> queryListMessage(Message message) throws Exception{
		MessageDao   messageDao=new MessageDao();
		return messageDao.queryListMessage(message);
	}
	
	/**
	 * 通过指令查看信息
	 */
	public String queryCommandMassage(Message message){
		MessageDao   messageDao=new MessageDao();
		List<Message> list=new ArrayList<Message>();
		
		if((Iconst.HELP_COMMAND).equals(message.getCommand())){
			message.setCommand(null);
			message.setDescription(null);
			StringBuilder result=new StringBuilder();
				list=messageDao.queryListMessage(message);
				for(int i=0;i<list.size();i++){
					if(i!=0){
						result.append("<br/>");
					}
					result.append("回复["+list.get(i).getCommand()+"]"+"可以查看"+list.get(i).getDescription());
				}
			return result.toString();
	}
		list=messageDao.queryListMessage(message);
		if(list.size()>0){
			return (String) list.get(0).getContent();
		}
		else{
			return Iconst.NO_MATCHING_CONTENT;
		}
  }
	
}
	
