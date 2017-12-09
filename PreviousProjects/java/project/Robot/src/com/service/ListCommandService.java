package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.dao.CommandDao;
import com.entity.Command;
import com.entity.CommandContent;
import com.util.Iconst;

/**
 * �б���ص�ҵ����
 */
public class ListCommandService {
	/**
	 * ͨ��ָ��鿴��Ϣ
	 */
	public String queryByCommand(Command command){
		CommandDao   commandDao=new CommandDao();
		List<Command> list=new ArrayList<Command>();
		
		if((Iconst.HELP_COMMAND).equals(command.getName())){
			command.setName(null);
			command.setDescription(null);
			StringBuilder result=new StringBuilder();
			list=commandDao.queryCommandList(command);
				for(int i=0;i<list.size();i++){
					if(i!=0){
						result.append("<br/>");
					}
					result.append("�ظ�["+list.get(i).getName()+"]"+"���Բ鿴"+list.get(i).getDescription());
				}
			return result.toString();
	}
		list=commandDao.queryCommandList(command);
		if(list.size()>0){
			List<CommandContent> listContent=list.get(0).getList();
			//random�ķ�Χ:��0����������ʼ���ǲ�����listContent.size()�������
			int i=new Random().nextInt(listContent.size());
			return listContent.get(i).getContent();
		}
		else{
			return Iconst.NO_MATCHING_CONTENT;
		}
  }
	
}
	
