package com.sunny.parse.dom4j.xpath;

import java.io.File;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Before;
import org.junit.Test;

public class TestBook {
	private Document document;
	
	//得到document 
	@Before
	public void innit() throws DocumentException {
		// 得到saxReader
		SAXReader saxReader = new SAXReader();
		
		// 得到document对象
		document = saxReader.read(new File("src/com/sunny/parse/dom4j/xpath/xpath.xml"));
	}
	
	// 得到所有的作者
	@Test
	public void getAllAuthor() {
		@SuppressWarnings("unchecked")
		List<Node> listAuthorNode = document.selectNodes("//author");
		
		for (Node e : listAuthorNode) {
			System.out.println(e.getStringValue());
		}
	}
	
	// 得到节点的属性值
	@Test
	public void judgeAttr() {
		String userName = "david";
		String password = "123";
		
		Node node = document.selectSingleNode("//book[@userName='" + userName + "' and @password='" + password +"']");
		if(node == null) {
			System.out.println("用户名或密码错误");
		} else {
			System.out.println("登陆成功");
		}
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void getNodeAttr() {
		List<Node> listNode = document.selectNodes("//book[@userName]");
		System.out.println(listNode);
	}
}
