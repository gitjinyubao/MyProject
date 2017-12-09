package com.bizImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.ClickBiz;
import com.dao.ClickDao;
@Service("ClickBizImpl")
public class ClickBizImpl implements   ClickBiz{
	
	@SuppressWarnings("unused")
	@Autowired
	private     ClickDao    clickDao;

	public void setClickDao(ClickDao clickDao) {
		this.clickDao = clickDao;
	}
	

}
