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
		//�õ�����ʵ��
		ApplicationContext  app=new ClassPathXmlApplicationContext("applicationContext.xml");
//		UserDao userDao=(UserDao)app.getBean("userDao");
//		userDao.delete();
//		UserDao userDao1=(UserDao)app.getBean("userDao1");
//		userDao1.delete();
		UserBiz   userBiz=(UserBiz)app.getBean("userBiz");
		
		
		/*����ģʽ����ֻ�ᴴ��һ������
		UserBiz   userBiz=(UserBiz)app.getBean("userBiz");
		UserBiz   userBiz1=(UserBiz)app.getBean("userBiz");
		userBiz��userBiz1����ȵ�==*/
		
		
		
		userBiz.sale(9000);
		
}
}
