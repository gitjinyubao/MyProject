package comman.spring.aop;

import java.util.Map;

public class Aop {
	private String id;
	private String  classPath;
	private Map<String, String> propertys;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getClassPath() {
		return classPath;
	}
	
	public void setClassPath(String classPath) {
		this.classPath = classPath;
	}
	
	public Map<String, String> getPropertys() {
		return propertys;
	}
	
	public void setPropertys(Map<String, String> propertys) {
		this.propertys = propertys;
	}
}
