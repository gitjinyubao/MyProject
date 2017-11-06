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
	// 定义一个字段为文件名
	private static String fileName;
	
	private static Map<String, Object> beans = new HashMap<String, Object>();
	
	public ClassPathApplicationContext(String fileName){
		ClassPathApplicationContext.fileName = fileName;
	}
	
	static {
		try{
			// 加载配置文件
			File f = new File("ApplicationContext.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder;
			builder = factory.newDocumentBuilder();
			Document document = (Document) builder.parse(f);
			
			// 获取根节点
			Element root = document.getRootElement();
			
			// 得到根节点下面的所有子节点
			List<Element> listChildren = root.elements();
			
			// 遍历子节点
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
		        	method.invoke(obj, propertyObject); //set注入StudentDao对象
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
