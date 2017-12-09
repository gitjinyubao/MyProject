package imp;

import jiekou.UserDao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {

	/**
	 * @param args
	 */
	@Test
	public   void   text()
	{
		 ApplicationContext   app=new ClassPathXmlApplicationContext("userdao");
         UserDao1   user=(UserDao1)app.getBean("userdao");
         user.delete();
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//         ApplicationContext   app=new ClassPathXmlApplicationContext("userdao");
//         UserDao   user=(UserDao)app.getBean("userdao");
//         user.delete();
//	}
}
