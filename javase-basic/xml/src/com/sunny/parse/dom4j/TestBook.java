package com.sunny.parse.dom4j;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Before;
import org.junit.Test;

import com.sunny.parse.Book;

public class TestBook {
	private Element root;
	private Document document;
	
    @Before
	public void testBefore() throws DocumentException {
    	// 1.�õ�SAXReader
		SAXReader saxReader = new SAXReader();
    			 
        // 2.���Document����
	    document = saxReader.read(new File("src/com/sunny/parse/dom4j/dom4j.xml"));
	    
	    // �õ����ڵ�
	    root = document.getRootElement();
	}

    // �õ���һ���������ֵ
	@Test
	public void testBookAttribute() {
	    Element bookElement = (Element) root.elements("book").get(1);
	    String attrValue = bookElement.attributeValue("id");
	    System.out.println(attrValue);
	}
	
	// �õ���һ�����ڵ�����
	@Test
	public void testBookContent() {
		Element bookElement = (Element) root.elements("book").get(1);
		Book book = new Book();
		book.setAuthor(bookElement.elementText("author"));
		book.setPrice(bookElement.elementText("price"));
		book.setName(bookElement.elementText("name"));
		System.out.println(book.toString());
	}
	
	// �ڵ�һ�������һ��ϴ���ۼ� �ۼ�209Ԫ����������
	@Test
	public void addBookPrice() throws IOException {
		// ����document����
		Element element = (Element) root.elements("book").get(0);
		element.addElement("�۸�").setText("209");
		
		// �����º��documentд��xml�ĵ���
		// ��ʹ�ø�ʽ�������
		// XMLWriter xmlWriter = new XMLWriter(new FileWriter("src/com/sunny/parse/dom4j/dom4j.xml")); // ʹ��fileWriter����ָ����д��encoding�������������
		/* XMLWriter xmlWriter = new XMLWriter(new OutputStreamWriter(new FileOutputStream("src/com/sunny/parse/dom4j/dom4j.xml"), "utf-8"));
		   xmlWriter.write(document); // UTF-8(Ĭ��)
		 */
		
		// д���ĵ�
		writeInXml();
	}
	
	// �ڵ�һ����ָ��λ�����һ���µ��ۼ۽ڵ�
	@SuppressWarnings("unchecked")
	@Test
	public void addNewPrice() throws IOException {
		Element bookElement = (Element) root.elements("book").get(0);
		List<Element> list = bookElement.elements();
		
		// ����Ԫ��
		Element priceElement = DocumentHelper.createElement("price");
		priceElement.setText("309");
		list.add(1, priceElement);
		
		writeInXml();
	}
	
	// ɾ��������ӵĽ�
	@Test
	public void deleteNewPrice() throws IOException {
		Element bookElement = (Element) root.elements("book").get(0);
		Element priceElement = (Element) bookElement.elements("price").get(0);
		priceElement.getParent().remove(priceElement);
		
		writeInXml();
	}

	// �޸Ľڵ�
	@Test
	public void updateNewPrice() throws FileNotFoundException, IOException {
		Element bookElement = (Element) root.elements("book").get(0);
		Element priceElement = (Element) bookElement.elements("price").get(0);
		priceElement.setText("9999");
		
		writeInXml();
	}
	
	// д���ĵ�
	private void writeInXml() throws FileNotFoundException, IOException {
		// ʹ�ø�ʽ�������
	    OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("gb2312");
		
		XMLWriter xmlWriter = new XMLWriter(new OutputStreamWriter(new FileOutputStream("src/com/sunny/parse/dom4j/dom4j.xml")), format);
		xmlWriter.write(document);
		
		// �ر���Դ
		xmlWriter.close();
	}
}
