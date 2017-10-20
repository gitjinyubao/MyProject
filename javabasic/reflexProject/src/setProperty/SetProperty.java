package setProperty;

import java.lang.reflect.Field;

public class SetProperty {
	
	public static void setProperty(Object obj, String propertyName, Object value) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		// 根据对象获得类的字节码文件对象
		Class c = obj.getClass();
		
		// 得到成员变量
		Field f = c.getDeclaredField(propertyName);

		// 取消访问检查
		f.setAccessible(true);
		
		// 给属性赋值
		f.set(obj, value);
	}
}
