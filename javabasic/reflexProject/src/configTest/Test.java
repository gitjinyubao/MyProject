package configTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 * 通过配置文件运行类中的方法
 * 
 * 反射：
 *    需要有配置文件配合使用
 *    使用config.txt代替
 *       并且知道两个键
 *           className
 *           method
 */
public class Test {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// 加载键值对数据
		Properties properties = new Properties();
		FileReader fr = new FileReader("config.txt");
		properties.load(fr);
		fr.close();
		
		// 获取数据
		String className = properties.getProperty("className");
		String methodName = properties.getProperty("methodName");
		
		// 反射
		Class c = Class.forName(className);
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		Method m = c.getMethod(methodName);
		
		// 调用方法
		m.invoke(obj, null);
	}
}
