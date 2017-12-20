package comman.iocdi;

import java.io.File;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.dom4j.Document;
import org.dom4j.Element;

public class ClassPathApplicationContext implements BeanFactory {
	// ����һ���ֶ�Ϊ�ļ���
	private static String fileName;
	
	private static Map<String, Object> beans = new HashMap<String, Object>();
	
	public ClassPathApplicationContext(String fileName){
		ClassPathApplicationContext.fileName = fileName;
	}
	
	static {
		try{
			// ���������ļ�
			File f = new File("ApplicationContext.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder;
			builder = factory.newDocumentBuilder();
			Document document = (Document) builder.parse(f);
			
			// ��ȡ���ڵ�
			Element root = document.getRootElement();
			
			// �õ����ڵ�����������ӽڵ�
			List<Element> listChildren = root.elements();
			
			// �����ӽڵ�
			for(int i = 0; i < listChildren.size(); ++i) {
				Element e = listChildren.get(i);
				String id = e.attributeValue("id");
				String className = e.attributeValue("class");
				Object obj = Class.forName(className).newInstance();
		        beans.put(id, obj);
		        
		        for (Element ee : listChildren.get(i).elements()) {
		        	String name = ee.attributeValue("name");
		        	String bean = ee.attributeValue("bean");
		        	Object propertyObject = beans.get(bean);
		        	String metodName = "Set" + name.substring(0,1).toUpperCase() + name.substring(1); // setUserDao
		        	Method method = obj.getClass().getMethod(metodName, propertyObject.getClass()) 	;
		        	method.invoke(obj, propertyObject); //setע��StudentDao����
		        }
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Object getBean(String beanId) {
		return beans.get(beanId);
	}
}
