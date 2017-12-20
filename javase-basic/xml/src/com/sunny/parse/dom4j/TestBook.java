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
    	// 1.得到SAXReader
		SAXReader saxReader = new SAXReader();
    			 
        // 2.获得Document对象
	    document = saxReader.read(new File("src/com/sunny/parse/dom4j/dom4j.xml"));
	    
	    // 得到根节点
	    root = document.getRootElement();
	}

    // 得到第一本书的属性值
	@Test
	public void testBookAttribute() {
	    Element bookElement = (Element) root.elements("book").get(1);
	    String attrValue = bookElement.attributeValue("id");
	    System.out.println(attrValue);
	}
	
	// 得到第一本书内的内容
	@Test
	public void testBookContent() {
		Element bookElement = (Element) root.elements("book").get(1);
		Book book = new Book();
		book.setAuthor(bookElement.elementText("author"));
		book.setPrice(bookElement.elementText("price"));
		book.setName(bookElement.elementText("name"));
		System.out.println(book.toString());
	}
	
	// 在第一本书添加一个洗呢售价 售价209元：乱码问题
	@Test
	public void addBookPrice() throws IOException {
		// 更新document对象
		Element element = (Element) root.elements("book").get(0);
		element.addElement("价格").setText("209");
		
		// 将更新后的document写入xml文档中
		// 不使用格式化输出器
		// XMLWriter xmlWriter = new XMLWriter(new FileWriter("src/com/sunny/parse/dom4j/dom4j.xml")); // 使用fileWriter不能指定书写的encoding，容易造成乱码
		/* XMLWriter xmlWriter = new XMLWriter(new OutputStreamWriter(new FileOutputStream("src/com/sunny/parse/dom4j/dom4j.xml"), "utf-8"));
		   xmlWriter.write(document); // UTF-8(默认)
		 */
		
		// 写入文档
		writeInXml();
	}
	
	// 在第一本书指定位置添加一个新的售价节点
	@SuppressWarnings("unchecked")
	@Test
	public void addNewPrice() throws IOException {
		Element bookElement = (Element) root.elements("book").get(0);
		List<Element> list = bookElement.elements();
		
		// 创建元素
		Element priceElement = DocumentHelper.createElement("price");
		priceElement.setText("309");
		list.add(1, priceElement);
		
		writeInXml();
	}
	
	// 删除上面添加的节
	@Test
	public void deleteNewPrice() throws IOException {
		Element bookElement = (Element) root.elements("book").get(0);
		Element priceElement = (Element) bookElement.elements("price").get(0);
		priceElement.getParent().remove(priceElement);
		
		writeInXml();
	}

	// 修改节点
	@Test
	public void updateNewPrice() throws FileNotFoundException, IOException {
		Element bookElement = (Element) root.elements("book").get(0);
		Element priceElement = (Element) bookElement.elements("price").get(0);
		priceElement.setText("9999");
		
		writeInXml();
	}
	
	// 写入文档
	private void writeInXml() throws FileNotFoundException, IOException {
		// 使用格式化输出器
	    OutputFormat format = OutputFormat.createPrettyPrint();
		format.setEncoding("gb2312");
		
		XMLWriter xmlWriter = new XMLWriter(new OutputStreamWriter(new FileOutputStream("src/com/sunny/parse/dom4j/dom4j.xml")), format);
		xmlWriter.write(document);
		
		// 关闭资源
		xmlWriter.close();
	}
}
