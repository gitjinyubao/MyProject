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
               //��ȡApplicationContext����
               ApplicationContext ac=new FileSystemXmlApplicationContext("/WebRoot/WEB-INF/classes/config.xml");
               //����ApplicationContext������HelloWord����getBean�����еĲ�����Ϊ
               //�����ļ��е�Bean��Idֵ
               HelloWord hellWord1=(HelloWord)ac.getBean("HelloWord");
               System.out.println(hellWord1.getMessage());
	}

}
