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
	//定义存储xml文件节点信息的map
	private static Map<String, Object> beans = new HashMap<String, Object>();
	
	public ClassPathApplicationContext() {
		this.innitBeanFactory();
	}
	
	public void innitBeanFactory() {
		try{
			// 加载配置文件:注意此时路径的引入
		    InputStream is= this.getClass().getClassLoader().getResourceAsStream(ConstantUtil.APPLICATION_CONTEXT_PROPERTY_PATH);
			
			// 使用dom4j解析xml文件获取document对象
			SAXReader saxReader = new SAXReader();
			Document document = saxReader.read(is);
			
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
				Iterator<Element> it = listChildren.get(i).elementIterator();
				
				if (it.hasNext()) {
				    for (Element ee : listChildren.get(i).elements()) {
			        	String name = ee.attributeValue("name");
			        	String bean = ee.attributeValue("bean");
			        	Object propertyObject = beans.get(bean);
			        	String methodName = "set" + name.substring(0,1).toUpperCase() + name.substring(1); // setUserDao
			        	Method method = obj.getClass().getMethod(methodName, propertyObject.getClass());
			        	method.invoke(obj, propertyObject); //set注入StudentDao对象
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
