package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Demo {
     private   Test   t;

     //≤…”√setter◊¢»Î
	public void setT(Test t) {
		this.t = t;
	}
     
	public static  void   main(String  []    args)
	{
		ApplicationContext    ac= new ClassPathXmlApplicationContext("applicationContext.xml");
		Demo  d=(Demo)ac.getBean("demo");
		System.out.println(d.t.toString());
		
		
	}	
}
