package comman.ioc;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class ClassPathApplicationContext implements ApplicationContext {
	// ����һ���ֶ�Ϊ�ļ���
	private String fileName;
	
	public ClassPathApplicationContext(String fileName){
		this.fileName = fileName;
	}
	
	@Override
	public Object getBean(String beanId) {
		// ��ȡ��ǰ�ļ����ڵ�·��
		String currentPath = this.getClass().getResource("").getPath();
		
		// ��ȡapplicationContex�ļ���·��
		String path = currentPath + fileName;
		
		// ����һ��SAXReader����ȡ�ļ�
		SAXReader reader = new SAXReader();
		
		// ����һ��Document���������õ�sax��ȡ�����ļ�֮���Document����
		Document document = null;
		
		// ����Object�������ش����Ķ���
		Object object = null;
		
		try{
			document = reader.read(path);
			Element e = (Element) document.selectSingleNode("beans/bean[@id='" + beanId + "']");
			String className = e.attributeValue("class");
			e.attributes();
			// ���÷���
			object = Class.forName(className).newInstance();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return object;
	}
}
