package people;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPeople {
	@Test
	public  void  testPeople()
	{
		//加载配置文件进行容器的初始化
		@SuppressWarnings("unused")
		ApplicationContext   ac=new ClassPathXmlApplicationContext("ApplicationContext.xml");
	}
}
