package com.sunny.parse.sax;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

import com.sunny.parse.Book;

public class parseUtil {
	public static List<Book> getXmlInfo(String url)
			throws ParserConfigurationException, SAXException, IOException {
		// 1. 创建解析工厂
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();

		// 2. 得到解析器
		SAXParser saxParser = saxParserFactory.newSAXParser();

		// 3. 得到读取器
		XMLReader xmlReader = saxParser.getXMLReader();

		// 4.设置内容处理器
		// xmlReader.setContentHandler(new ListHandle());
		// xmlReader.setContentHandler(new TagValueHandler());
		BeanListHandler beanListHandler = new BeanListHandler();
		xmlReader.setContentHandler(beanListHandler);
		
		// 5.读取xml文档内容
		xmlReader.parse(url);
		List<Book> list = new ArrayList<>();
		list = beanListHandler.getListBean();
		return list;
	}

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		List<Book> list = getXmlInfo("src/com/sunny/parse/sax/sax.xml");
		System.out.println(list);
	}
}

// 采用实现接口的方式
class ListHandler implements ContentHandler {

	@Override
	public void setDocumentLocator(Locator locator) {
	}

	@Override
	public void startDocument() throws SAXException {
	}

	@Override
	public void endDocument() throws SAXException {
	}

	@Override
	public void startPrefixMapping(String prefix, String uri) throws SAXException {
	}

	@Override
	public void endPrefixMapping(String prefix) throws SAXException {
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
		// System.out.println("<" + qName +">");

		for (int i = 0; atts != null && i < atts.getLength(); ++i) { // 将判断写在for循环中
			String name = atts.getQName(i);
			String value = atts.getValue(i);
			System.out.println("name=" + name + " value=" + value);
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("</" + qName + ">");
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException { // 解析标签内的内容
		System.out.println(new String(ch, start, length)); // 直接将字符数组转化为字符串
	}

	@Override
	public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
	}

	@Override
	public void processingInstruction(String target, String data) throws SAXException {
	}

	@Override
	public void skippedEntity(String name) throws SAXException {
	}
}

//采用继承实现ContentHandler接口的DefaultHandler
class TagValueHandler extends DefaultHandler {
	private String currentTagName;
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
		this.currentTagName = qName;
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		this.currentTagName = null;
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException { // 解析标签内的内容
		if("c".equals(currentTagName)) {
			System.out.println(new String(ch, start, length));
		}
	}
}

// 把xml中的一个书本封装到一个book对象，再把多个book对象放置到list集合中
class BeanListHandler extends DefaultHandler {
	private Book book;
	private String currentTag;
	private List<Book> list = new ArrayList<>();
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
		this.currentTag = qName;
		if("book".equals(qName)) {
			book = new Book();
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException { // 解析标签内的内容
		if ("author".equals(this.currentTag)) {
			book.setAuthor(new String(ch, start, length));
		}
		
		if ("price".equals(this.currentTag)) {
			book.setPrice(new String(ch, start, length));
		}
		
		if ("name".equals(this.currentTag)) {
			book.setName(new String(ch, start, length));
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if ("book".equals(qName)) {
			list.add(book);
			book = null;
		}
		
		this.currentTag = null; // 如果省去会出现空指针异常
	}
	
	public List<Book> getListBean() {
		return this.list;
	}
}