package 解析文档1;

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
		//创建一个DocumentBuilderFactory对象
        DocumentBuilderFactory d= DocumentBuilderFactory.newInstance();
        //创建一个DocumentBuilder的对象
        try {
			DocumentBuilder d1=d.newDocumentBuilder();
			//通过调用parse（）方法,将文件导入到当前项目下
				Document d2=d1.parse("E:\\javawebProject\\jin.xml");
				//通过方法.getElementsByTagName()；获得节点列表
				NodeList list1=d2.getElementsByTagName("book");
				//遍历每个book节点
				System.out.println("一共有："+list1.getLength()+"本书");
				for(int i=0;i<list1.getLength();++i)
				{
					//通过item(i)方法获取一个book节点
				 Node book=list1.item(i);//Node专门用来接收item(i)的返回值
				 NamedNodeMap n= book.getAttributes();//返回值是book里面所有的属性的集合
				 System.out.println("第"+(i+1)+"本书"+"共有"+n.getLength()+"个属性");
					for(int b=0;b<n.getLength();++b)
					{
						//通过item()方法获取此时的属性
						Node n1=n.item(b);
						System.out.print("属性名："+n1.getNodeName()+"  ");
						System.out.println("属性值："+n1.getNodeValue()+" ");
					}
					/**
					 * 获取book节点的子节点
					 */
					NodeList childNode=book.getChildNodes();
					System.out.println("第"+(i+1)+"本书"+"一共有："+childNode.getLength()+"个子节点");
					for(int g=0;g<childNode.getLength();++g)
					{
					     Node childbook=childNode.item(g);
					     System.out.print("第"+(g+1)+"个节点的节点名为："+childbook.getNodeName()+"  ");
					     //System.out.println("第"+(g+1)+"个节点的值为："+childbook.getFirstChild());
					     System.out.println("第"+(g+1)+"个节点的值为："+childbook.getTextContent());
					}
					System.out.println("结束第"+(i+1)+"一本书的遍历");
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
        //通过DocumentBuilder的parse(String Filename)解析文件
        /**
         * 注意在catch中书写语句
         */
	}
}
