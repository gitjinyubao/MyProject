package people;

import java.io.IOException;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPeople {
	
	static ApplicationContext   bc;
	static  
	{
		bc=new   ClassPathXmlApplicationContext("applicationContext.xml");
		
		
	}
	public  static  ApplicationContext     getAc()
	{
		ApplicationContext   ac=new   ClassPathXmlApplicationContext("applicationContext.xml");
		return ac;
	}
	
	@Test
	public   void  testSingle()
	{
		//ֻ����һ������������
		ApplicationContext  ac=TestPeople.getAc();
		People p=(People)ac.getBean("people");
		People p1=(People)ac.getBean("people");
		System.out.println(p==p1);		
	}

	@Test
	public   void   testSingle1()
	{
		//��������������֮�󴴽��Ķ�������������ͬ�������д����ģ����ԾͲ�һ����
		ApplicationContext  ac=TestPeople.getAc();
		ApplicationContext  ac1=TestPeople.getAc();
		People p=(People)ac.getBean("people");
		People p1=(People)ac1.getBean("people");
		System.out.println(p==p1);
	}
	
	@Test
	public   void    testClathpath  () throws IOException
	{
		People  p=(People)bc.getBean("people");
		/*String words1="classpath:spring.txt";
		p.resourceText(words1);*/
		System.out.println("------------");
		String words2="file:c://spring1_9//src//people//Resource//spring.txt";
		p.resourceText(words2);
		System.out.println("------------");
		String words3="url:http://www.imooc.com/search/course?words=spring";
		p.resourceText(words3);	
	}
}
