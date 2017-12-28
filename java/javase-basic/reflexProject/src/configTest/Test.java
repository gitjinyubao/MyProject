package configTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 * ͨ�������ļ��������еķ���
 * 
 * ���䣺
 *    ��Ҫ�������ļ����ʹ��
 *    ʹ��config.txt����
 *       ����֪��������
 *           className
 *           method
 */
public class Test {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// ���ؼ�ֵ������
		Properties properties = new Properties();
		FileReader fr = new FileReader("config.txt");
		properties.load(fr);
		fr.close();
		
		// ��ȡ����
		String className = properties.getProperty("className");
		String methodName = properties.getProperty("methodName");
		
		// ����
		Class c = Class.forName(className);
		Constructor con = c.getConstructor();
		Object obj = con.newInstance();
		Method m = c.getMethod(methodName);
		
		// ���÷���
		m.invoke(obj, null);
	}
}
