package com.service;

import com.dao.InjectionDao;

public class InjectionServiceImpl implements InjectionService {
//��ֵע�룺
	private InjectionDao injectionDao;
	
	//IOC�����ڽ���ע��ʱ�����Զ�����set����
	public void setInjectionDao(InjectionDao injectionDao) {
		this.injectionDao = injectionDao;
	}


	@Override
	public void save(String arg) {
		// TODO Auto-generated method stub
		injectionDao.save("Injection  injection");
		System.out.println("service���ղ�����"+arg+this.hashCode());
	}
}
