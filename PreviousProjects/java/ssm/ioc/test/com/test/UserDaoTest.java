package com.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.biz.impl.UserBizImpl;
import com.biz1.UserBiz;
import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;

public class UserDaoTest {
	@Test
public void testUserSave()
{
//	System.out.println("sava");
//		UserDaoImpl   userDao=new UserDaoImpl ();
//		userDao.delete();
		//得到容器实例
		ApplicationContext  app=new ClassPathXmlApplicationContext("applicationContext.xml");
//		UserDao userDao=(UserDao)app.getBean("userDao");
//		userDao.delete();
//		UserDao userDao1=(UserDao)app.getBean("userDao1");
//		userDao1.delete();
		UserBiz   userBiz=(UserBiz)app.getBean("userBiz");
		
		
		/*单例模式容器只会创建一个对象
		UserBiz   userBiz=(UserBiz)app.getBean("userBiz");
		UserBiz   userBiz1=(UserBiz)app.getBean("userBiz");
		userBiz和userBiz1是相等的==*/
		
		
		
		userBiz.sale(9000);
		
}
}
