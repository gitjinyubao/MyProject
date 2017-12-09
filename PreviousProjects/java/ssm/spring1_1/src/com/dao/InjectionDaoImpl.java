package com.dao;

public class InjectionDaoImpl implements InjectionDao {

	@Override
	public void save(String arg) {
		// TODO Auto-generated method stub
		//模拟数据库的保存数据；此实现类相当于是InJection.xml的配置文件内容
		System.out.println("保存数据,接收参数:"+arg+this.hashCode());

	}

}
