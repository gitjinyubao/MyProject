package �����ĵ�1;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

import Book_.Book;
import SAXPaserHandler.SAXPaserHandler;
public class SAX {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ȡһ��SAXPaserfactoeyʵ��
       SAXParserFactory f=SAXParserFactory.newInstance();
       try {
    	 //ͨ��f��ȡSAXPaser��ʵ��
    	   SAXParser s=f.newSAXParser();
    	   //����SAXPaserHandler�Ķ���
           SAXPaserHandler s1=new SAXPaserHandler();
//           for(Book book:s1.getA())
//           {
//        	   System.out.println(book.getId());
//        	   System.out.println(book.getName());
//        	   System.out.println(book.getPrice());
//        	   System.out.println(book.getYear());
//           }
           try {
			s.parse("jin.xml", s1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
	} catch (ParserConfigurationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SAXException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}

