package people;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPeople {
	@Test
	public  void  testPeople()
	{
		//���������ļ����������ĳ�ʼ��
		ApplicationContext   ac=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		People people=(People)ac.getBean("people");
		people.pring();
	}
}
