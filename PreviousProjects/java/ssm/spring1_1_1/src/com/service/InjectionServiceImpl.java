package com.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.dao.InjectionDao;

//注解的方式进行对业务层对象的注入
@Scope("prototype")
@Service
public class InjectionServiceImpl implements   InjectionService{
	//利用接口进行层与层之间的通信
	private     InjectionDao    injectionDao;
	
	//通过注解的方式自动进行类类型的成员变量的依赖注入
	@Autowired
	//通过set方式进行依赖注入InjectionDao,通过set方法
	public void setInjectionDao(InjectionDao injectionDao) {
		this.injectionDao = injectionDao;
	}
	public void save() {
		// TODO Auto-generated method stub
		injectionDao.save();
		System.out.println("通过业务层对数据访问层进行访问调度");
	}
}
