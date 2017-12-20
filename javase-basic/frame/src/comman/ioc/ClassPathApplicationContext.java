package comman.ioc;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ClassPathApplicationContext implements ApplicationContext {
	// 定义一个字段为文件名
	private String fileName;
	
	public ClassPathApplicationContext(String fileName){
		this.fileName = fileName;
	}
	
	@Override
	public Object getBean(String beanId) {
		// 获取当前文件所在的路径
		String currentPath = this.getClass().getResource("").getPath();
		
		// 获取applicationContex文件的路径
		String path = currentPath + fileName;
		
		// 创建一个SAXReader来读取文件
		SAXReader reader = new SAXReader();
		
		// 创建一个Document对象，用来得到sax读取配置文件之后的Document对象
		Document document = null;
		
		// 创建Object用来返回创建的对象
		Object object = null;
		
		try{
			document = reader.read(path);
			Element e = (Element) document.selectSingleNode("beans/bean[@id='" + beanId + "']");
			String className = e.attributeValue("class");
			e.attributes();
			// 利用反射
			object = Class.forName(className).newInstance();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return object;
	}
}
