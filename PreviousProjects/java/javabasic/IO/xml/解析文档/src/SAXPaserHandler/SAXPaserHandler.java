package SAXPaserHandler;
import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import Book_.Book;
public class SAXPaserHandler extends DefaultHandler {
	/**
	 * 用来遍历xml文件的开始标签
	 */
	Book book=null;
	String s=null;
	int bookIndex=0;
	private ArrayList<Book> a=new ArrayList<Book>();
	public ArrayList<Book> getA() {
		return a;
	}
	public void setA(ArrayList<Book> a) {
		this.a = a;
	}
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		//attributes：属性;attributes.getLength()：获取属性个数
		if(qName.equals("book"))
		{
			//创建一个book对像
			Book book=new Book();
			bookIndex++;
			int i=0;
			for(;i<attributes.getLength();++i)
			{
				//获取属性名
				System.out.print("book"+"元素的第"+(i+1)+"个属性名为："+attributes.getQName(i));
				System.out.println("属性值为："+attributes.getValue(i));
				if(attributes.getQName(i).equals("id"))
				{
				        book.setId(attributes.getQName(i));	
				}
			}
		}
		else if( !(qName.equals("book")&&!qName.equals("bookstory")))
		{
		     System.out.print("节点名是："+qName+"  ");
		}
		// TODO Auto-generated method stub
		super.startElement(uri, localName, qName, attributes);
	}
	/**
	 * 取得节点中的内容（值）
	 */
	@Override 
	public void characters(char[] ch, int start, int length) throws SAXException {
		// TODO Auto-generated method stub
		super.characters(ch, start, length);
		s=new String(ch, start, length);
		if(!(s.trim().equals(" ")))
		{
			System.out.println(s);	
		}		
	}
	/**
	 * 用来遍历xml文件的结束标签
	 */
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, qName);
		//判断一本书是否遍历结束
		if(qName.equals("book"))
		{
			a.add(book);
			book=null;
			System.out.println("结束第"+bookIndex+"本书的遍历");
		}
//		else if(qName.equals("name"))
//		{
//			book.setName(s);
//		}
//		else if(qName.equals("year"))
//		{
//			book.setYear(s);
//		}
//		else if(qName.equals("price"))
//		{
//			book.setPrice(s);
//		}
	}
	/**
	 * 用来标识解析开始
	 * @param args
	 */
	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();
		System.out.println("SAX开始解析");
	}//走到第一行的时候就会认为解析开始
	/**
	 *用来标识解析结束 
	 * @param args
	 */
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
		System.out.println("SAX结束解析");
	}//走到最后一行的时候就会认为解析结束
}
