package comman.spring.iocdi;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import utils.ConstantUtil;

public class ClassPathApplicationContext implements BeanFactory {
	//����洢xml�ļ��ڵ���Ϣ��map
	private static Map<String, Object> beans = new HashMap<String, Object>();
	
	public ClassPathApplicationContext() {
		this.innitBeanFactory();
	}
	
	public void innitBeanFactory() {
		try{
			// ���������ļ�:ע���ʱ·��������
		    InputStream is= this.getClass().getClassLoader().getResourceAsStream(ConstantUtil.APPLICATION_CONTEXT_PROPERTY_PATH);
			
			// ʹ��dom4j����xml�ļ���ȡdocument����
			SAXReader saxReader = new SAXReader();
			Document document = saxReader.read(is);
			
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
				Iterator<Element> it = listChildren.get(i).elementIterator();
				
				if (it.hasNext()) {
				    for (Element ee : listChildren.get(i).elements()) {
			        	String name = ee.attributeValue("name");
			        	String bean = ee.attributeValue("bean");
			        	Object propertyObject = beans.get(bean);
			        	String methodName = "set" + name.substring(0,1).toUpperCase() + name.substring(1); // setUserDao
			        	Method method = obj.getClass().getMethod(methodName, propertyObject.getClass());
			        	method.invoke(obj, propertyObject); //setע��StudentDao����
			        }
				}
				
				 beans.put(id, obj);
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
