package com.service;

import java.util.ArrayList;
import java.util.List;

import com.dao.MessageDao;
import com.entity.Message;
import com.util.Iconst;

/**
 * �б���ص�ҵ����
 */
public class ListMessageService {
	/**
	 *ҳ����Ϣ�б�
	 */
	public List<Message> queryListMessage(Message message) throws Exception{
		MessageDao   messageDao=new MessageDao();
		return messageDao.queryListMessage(message);
	}
	
	/**
	 * ͨ��ָ��鿴��Ϣ
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
					result.append("�ظ�["+list.get(i).getCommand()+"]"+"���Բ鿴"+list.get(i).getDescription());
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
	
