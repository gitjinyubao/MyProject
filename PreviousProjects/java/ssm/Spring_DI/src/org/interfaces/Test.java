
package org.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac=new FileSystemXmlApplicationContext("/WebRoot/WEB-INF/classes/config.xml");
		Man  man=(Man)ac.getBean("man");
		man.eatFood();

	}

}
