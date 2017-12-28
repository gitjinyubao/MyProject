package configTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*
 * 我给你ArrayList<Integer> 的一个对象，我想在这个集合中添加一个字符串数据，如何实现？
 *    利用反射绕过编译阶段，绕过泛型
 */
public class ArrayListDemo {
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// 创建集合对象
		ArrayList<Integer> list = new ArrayList<Integer>();
	    
		/*
		 *  注意：ArrayList类中的add方法的泛型是Object了类型
		 *      在这里规定ArrayList<Integer>是给编译器看的
		 *      利用反射就可以绕过编译
		 */
		
		// 利用反射拿到class文件对象
		Class c = list.getClass();
		
		// 获得方法
	    Method m = c.getMethod("add", Object.class);
	    
	    // 调用方法
	    m.invoke(list, "hello");
	    
	    System.out.println(list);
	}
}
