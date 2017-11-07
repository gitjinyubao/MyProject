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
	
	// ��ȡMapAop
	public MapAop getMapAop(){
		return MapAop.getMapAop();
	}
	
	// ����һ���ڲ��࣬�����洢xml�н�����aop
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

	// ɨ�������ļ�����dom�ڵ�ת��ΪBean�������Map
	@SuppressWarnings("finally")
	public static Map<String, Aop> analysisAopXml(String xmlPath){
		// ����һ���洢aop�ļ���
		Map<String, Aop> mapAop = new HashMap<String, Aop>();
		SAXReader s = new SAXReader();
		
		try{
			// ����xml�ļ�Ϊdocument
			Document document = s.read(xmlPath);
			
			// ��ȡ��Ԫ��
			Element root = document.getRootElement();
			
			// ��ȡ��Ԫ���µ�aop
			List<Element> list = root.elements();
			
			// ��ʼö��ÿ��aopԪ��
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
