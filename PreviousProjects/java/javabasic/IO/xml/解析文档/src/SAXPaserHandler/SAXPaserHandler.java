package SAXPaserHandler;
import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import Book_.Book;
public class SAXPaserHandler extends DefaultHandler {
	/**
	 * ��������xml�ļ��Ŀ�ʼ��ǩ
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
		//attributes������;attributes.getLength()����ȡ���Ը���
		if(qName.equals("book"))
		{
			//����һ��book����
			Book book=new Book();
			bookIndex++;
			int i=0;
			for(;i<attributes.getLength();++i)
			{
				//��ȡ������
				System.out.print("book"+"Ԫ�صĵ�"+(i+1)+"��������Ϊ��"+attributes.getQName(i));
				System.out.println("����ֵΪ��"+attributes.getValue(i));
				if(attributes.getQName(i).equals("id"))
				{
				        book.setId(attributes.getQName(i));	
				}
			}
		}
		else if( !(qName.equals("book")&&!qName.equals("bookstory")))
		{
		     System.out.print("�ڵ����ǣ�"+qName+"  ");
		}
		// TODO Auto-generated method stub
		super.startElement(uri, localName, qName, attributes);
	}
	/**
	 * ȡ�ýڵ��е����ݣ�ֵ��
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
	 * ��������xml�ļ��Ľ�����ǩ
	 */
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, qName);
		//�ж�һ�����Ƿ��������
		if(qName.equals("book"))
		{
			a.add(book);
			book=null;
			System.out.println("������"+bookIndex+"����ı���");
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
	 * ������ʶ������ʼ
	 * @param args
	 */
	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();
		System.out.println("SAX��ʼ����");
	}//�ߵ���һ�е�ʱ��ͻ���Ϊ������ʼ
	/**
	 *������ʶ�������� 
	 * @param args
	 */
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.endDocument();
		System.out.println("SAX��������");
	}//�ߵ����һ�е�ʱ��ͻ���Ϊ��������
}
