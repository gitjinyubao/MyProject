package springIocDi;

/*
 * <bean id="courseService" class="com.qcjy.learning.service.impl.CourseServiceImpl">
 * 	<!-- 控制调用setCourseDao()方法，将容器中的courseDao bean作为传入参数 -->
 * 	<property name="courseDao" ref="courseDao"></property> 
 * </bean>
 */
public class Di {
	
	public static void main(String[] args) {
		/*
		//解析<property .../>元素的name属性得到该字符串值为“courseDao”  
		String nameStr = "courseDao";  
		//解析<property .../>元素的ref属性得到该字符串值为“courseDao”  
		String refStr = "courseDao";  
		//生成将要调用setter方法名  
		String setterName = "set" + nameStr.substring(0, 1).toUpperCase()  
		        + nameStr.substring(1);  
		//获取spring容器中名为refStr的Bean，该Bean将会作为传入参数  
		Object paramBean = container.get(refStr);  
		//获取setter方法的Method类，此处的cls是刚才反射代码得到的Class对象  
		Method setter = cls.getMethod(setterName, paramBean.getClass());  
		//调用invoke()方法，此处的obj是刚才反射代码得到的Object对象  
		setter.invoke(obj, paramBean);
		*/
	}
}
