package org.interfaces.implement;

import org.springframework.context.ApplicationContext; 
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.sun.accessibility.internal.resources.accessibility;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext  ac=new FileSystemXmlApplicationContext("/WebRoot/WEB-INF/classes/config.xml");
		HelloWord   hw=(HelloWord)ac.getBean("helloword");
		System.out.println(hw.getMessage());
		
		//ΪSpring����ע��رչ��ӣ����򽫻����Ƴ�JVM֮ǰ�ر�Spring����
		((AbstractApplicationContext) ac).registerShutdownHook();

	}

}
