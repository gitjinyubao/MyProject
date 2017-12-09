package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.InjectionDao;
@Service
public class InjectionServiceImpl implements InjectionService {
//��ֵע�룺
	private InjectionDao injectionDao;
	
	@Autowired
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
