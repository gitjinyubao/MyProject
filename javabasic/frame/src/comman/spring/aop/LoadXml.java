package comman.spring.aop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class LoadXml {
	
	public LoadXml(String xmlPath) {
		xmlPath = this.getClass().getClassLoader().getResource("").getPath() + xmlPath;
		MapAop.getMapAop().setMap(LoadXml.analysisAopXml(xmlPath));
	}
	
	// 获取MapAop
	public MapAop getMapAop(){
		return MapAop.getMapAop();
	}
	
	// 定义一个内部类，用来存储xml中解析的aop
	public static class MapAop{
		private Map<String, Aop> map = new HashMap<String, Aop>();
		
		private MapAop() {}
		
		private static MapAop mapAop = new MapAop();
		
		public static MapAop getMapAop(){
			return mapAop;
		}

		public Map<String, Aop> getMap() {
			return map;
		}

		public void setMap(Map<String, Aop> map) {
			this.map = map;
		}
	}

	// 扫描配置文件，将dom节点转化为Bean对象存入Map
	@SuppressWarnings("finally")
	public static Map<String, Aop> analysisAopXml(String xmlPath){
		// 定义一个存储aop的集合
		Map<String, Aop> mapAop = new HashMap<String, Aop>();
		SAXReader s = new SAXReader();
		
		try{
			// 解析xml文件为document
			Document document = s.read(xmlPath);
			
			// 获取根元素
			Element root = document.getRootElement();
			
			// 获取根元素下的aop
			List<Element> list = root.elements();
			
			// 开始枚举每个aop元素
			for(Element e : list) {
				Aop aop = new Aop();
				List<Element> listChild = e.elements("property");
				Map<String, String> mapPropertys = new HashMap<String, String>();
				for(Element ee : listChild) {
					mapPropertys.put(ee.attributeValue("name"), ee.attributeValue("method"));
				}
				aop.setClassPath(e.attributeValue("class"));
				aop.setId(e.attributeValue("id"));
				aop.setPropertys(mapPropertys);
			    mapAop.put(aop.getId(), aop);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			return mapAop;
		}
	}
}
