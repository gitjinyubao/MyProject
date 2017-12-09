package com.service;

import com.dao.InjectionDao;

public class InjectionServiceImpl implements InjectionService {
//设值注入：
	private InjectionDao injectionDao;
	
	//IOC容器在进行注入时，会自动调用set方法
	public void setInjectionDao(InjectionDao injectionDao) {
		this.injectionDao = injectionDao;
	}


	@Override
	public void save(String arg) {
		// TODO Auto-generated method stub
		injectionDao.save("Injection  injection");
		System.out.println("service接收参数："+arg+this.hashCode());
	}
}
