package com.dao;

import org.springframework.stereotype.Repository;

//�������ע�뵽spring�����е�applicationContext�У�����ע��ķ�ʽ
@Repository
public class InjectionDaoImpl implements InjectionDao {
	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("InjectionDaoImpl"+" "+"���ݷ��ʲ�ִ�б������ݵĹ���");
	}	
}
