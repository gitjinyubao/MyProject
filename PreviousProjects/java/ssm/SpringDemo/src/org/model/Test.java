package org.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
               HelloWord   helloword=new HelloWord();
               helloword.setMessage("heloword!!!!");
               System.out.println(helloword.getMessage()); 
               //获取ApplicationContext对象
               ApplicationContext ac=new FileSystemXmlApplicationContext("/WebRoot/WEB-INF/classes/config.xml");
               //根据ApplicationContext对象获得HelloWord对象，getBean方法中的参数即为
               //配置文件中的Bean的Id值
               HelloWord hellWord1=(HelloWord)ac.getBean("HelloWord");
               System.out.println(hellWord1.getMessage());
	}

}
