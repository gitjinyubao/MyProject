package com.dao;

import org.springframework.stereotype.Repository;


@Repository
public class InjectionDaoImpl implements InjectionDao {
	public void save(String arg) {
		// TODO Auto-generated method stub
		//ģ�����ݿ�ı������ݣ���ʵ�����൱����InJection.xml�������ļ�����
		System.out.println("��������,���ղ���:"+arg+this.hashCode());

	}

}
