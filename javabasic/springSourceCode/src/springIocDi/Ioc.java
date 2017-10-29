package springIocDi;

/*
 * IOC：即“控制反转�?�，不是�?么技术，而是�?种�?�想�?
 * 使用IOC意味�?将你设计好的对象交给容器控制�?
 * 而不是传统的在你的对象内部直接控制�??
 */
public class Ioc {
	
	// <bean id="courseDao" class="com.qcjy.learning.Dao.impl.CourseDaoImpl"></bean>
    public static void main(String[] args) {
    	/*
    	//解析<bean .../>元素的id属�?�得到该字符串�?�为“courseDao” �?
    	String idStr = "courseDao";  
    	//解析<bean .../>元素的class属�?�得到该字符串�?�为“com.qcjy.learning.Dao.impl.CourseDaoImpl” �?
    	String classStr = "com.qcjy.learning.Dao.impl.CourseDaoImpl";  
    	//利用反射知识，�?�过classStr获取Class类对象 �?
    	Class<?> cls = Class.forName(classStr);  
    	//实例化对象 �?
    	Object obj = cls.newInstance();  
    	//container表示Spring容器  
    	container.put(idStr, obj);
    	*/
    }
}
