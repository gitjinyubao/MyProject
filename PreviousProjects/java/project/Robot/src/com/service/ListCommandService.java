package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.dao.CommandDao;
import com.entity.Command;
import com.entity.CommandContent;
import com.util.Iconst;

/**
 * 列表相关的业务功能
 */
public class ListCommandService {
	/**
	 * 通过指令查看信息
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
					result.append("回复["+list.get(i).getName()+"]"+"可以查看"+list.get(i).getDescription());
				}
			return result.toString();
	}
		list=commandDao.queryCommandList(command);
		if(list.size()>0){
			List<CommandContent> listContent=list.get(0).getList();
			//random的范围:从0（包含）开始但是不包含listContent.size()的随机数
			int i=new Random().nextInt(listContent.size());
			return listContent.get(i).getContent();
		}
		else{
			return Iconst.NO_MATCHING_CONTENT;
		}
  }
	
}
	
