package data;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date   date2 = new Date();
		ApplicationContext  ac=new FileSystemXmlApplicationContext("/WebRoot/WEB-INF/classes/config.xml");
		DateClass   d=(DateClass)ac.getBean("getDate");
		System.out.println(d.toString());
		System.out.println(d.getDate()+"...."+System.currentTimeMillis()+date2);
		Man   m=(Man)ac.getBean("man");
		m.eatFood();
	}

}
