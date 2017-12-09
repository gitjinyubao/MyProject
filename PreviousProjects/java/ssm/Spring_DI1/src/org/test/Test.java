package org.test;

import org.interfaces.implement.XiaoMi;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext   ac=new FileSystemXmlApplicationContext("/WebRoot/WEB-INF/classes/config.xml");
        XiaoMi   xm=(XiaoMi)ac.getBean("xiaomi");
        xm.getKindSource();
	}
}
