package com.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.dao.InjectionDao;

//ע��ķ�ʽ���ж�ҵ�������ע��
@Scope("prototype")
@Service
public class InjectionServiceImpl implements   InjectionService{
	//���ýӿڽ��в����֮���ͨ��
	private     InjectionDao    injectionDao;
	
	//ͨ��ע��ķ�ʽ�Զ����������͵ĳ�Ա����������ע��
	@Autowired
	//ͨ��set��ʽ��������ע��InjectionDao,ͨ��set����
	public void setInjectionDao(InjectionDao injectionDao) {
		this.injectionDao = injectionDao;
	}
	public void save() {
		// TODO Auto-generated method stub
		injectionDao.save();
		System.out.println("ͨ��ҵ�������ݷ��ʲ���з��ʵ���");
	}
}
