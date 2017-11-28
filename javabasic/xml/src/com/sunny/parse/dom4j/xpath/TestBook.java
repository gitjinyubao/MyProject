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
	
	//�õ�document 
	@Before
	public void innit() throws DocumentException {
		// �õ�saxReader
		SAXReader saxReader = new SAXReader();
		
		// �õ�document����
		document = saxReader.read(new File("src/com/sunny/parse/dom4j/xpath/xpath.xml"));
	}
	
	// �õ����е�����
	@Test
	public void getAllAuthor() {
		@SuppressWarnings("unchecked")
		List<Node> listAuthorNode = document.selectNodes("//author");
		
		for (Node e : listAuthorNode) {
			System.out.println(e.getStringValue());
		}
	}
	
	// �õ��ڵ������ֵ
	@Test
	public void judgeAttr() {
		String userName = "david";
		String password = "123";
		
		Node node = document.selectSingleNode("//book[@userName='" + userName + "' and @password='" + password +"']");
		if(node == null) {
			System.out.println("�û������������");
		} else {
			System.out.println("��½�ɹ�");
		}
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void getNodeAttr() {
		List<Node> listNode = document.selectNodes("//book[@userName]");
		System.out.println(listNode);
	}
}
