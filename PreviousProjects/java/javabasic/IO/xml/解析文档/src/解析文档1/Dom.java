package �����ĵ�1;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Dom {
	public static void main(String[] args){
		// TODO Auto-generated method stub
		//����һ��DocumentBuilderFactory����
        DocumentBuilderFactory d= DocumentBuilderFactory.newInstance();
        //����һ��DocumentBuilder�Ķ���
        try {
			DocumentBuilder d1=d.newDocumentBuilder();
			//ͨ������parse��������,���ļ����뵽��ǰ��Ŀ��
				Document d2=d1.parse("E:\\javawebProject\\jin.xml");
				//ͨ������.getElementsByTagName()����ýڵ��б�
				NodeList list1=d2.getElementsByTagName("book");
				//����ÿ��book�ڵ�
				System.out.println("һ���У�"+list1.getLength()+"����");
				for(int i=0;i<list1.getLength();++i)
				{
					//ͨ��item(i)������ȡһ��book�ڵ�
				 Node book=list1.item(i);//Nodeר����������item(i)�ķ���ֵ
				 NamedNodeMap n= book.getAttributes();//����ֵ��book�������е����Եļ���
				 System.out.println("��"+(i+1)+"����"+"����"+n.getLength()+"������");
					for(int b=0;b<n.getLength();++b)
					{
						//ͨ��item()������ȡ��ʱ������
						Node n1=n.item(b);
						System.out.print("��������"+n1.getNodeName()+"  ");
						System.out.println("����ֵ��"+n1.getNodeValue()+" ");
					}
					/**
					 * ��ȡbook�ڵ���ӽڵ�
					 */
					NodeList childNode=book.getChildNodes();
					System.out.println("��"+(i+1)+"����"+"һ���У�"+childNode.getLength()+"���ӽڵ�");
					for(int g=0;g<childNode.getLength();++g)
					{
					     Node childbook=childNode.item(g);
					     System.out.print("��"+(g+1)+"���ڵ�Ľڵ���Ϊ��"+childbook.getNodeName()+"  ");
					     //System.out.println("��"+(g+1)+"���ڵ��ֵΪ��"+childbook.getFirstChild());
					     System.out.println("��"+(g+1)+"���ڵ��ֵΪ��"+childbook.getTextContent());
					}
					System.out.println("������"+(i+1)+"һ����ı���");
				}
        }
			 catch (SAXException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        //ͨ��DocumentBuilder��parse(String Filename)�����ļ�
        /**
         * ע����catch����д���
         */
	}
}
