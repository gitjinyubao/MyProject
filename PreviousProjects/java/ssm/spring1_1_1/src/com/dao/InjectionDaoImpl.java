package com.dao;

import org.springframework.stereotype.Repository;

//将类进行注入到spring容器中的applicationContext中，采用注解的方式
@Repository
public class InjectionDaoImpl implements InjectionDao {
	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("InjectionDaoImpl"+" "+"数据访问层执行保存数据的功能");
	}	
}
