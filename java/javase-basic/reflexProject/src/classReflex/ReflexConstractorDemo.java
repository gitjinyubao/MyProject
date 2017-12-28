package classReflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
 * 通过反射获取构造方法并且使用
 */
public class ReflexConstractorDemo {
    
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		// 获取字节码（class）文件对象
		Class c = Class.forName("classReflex.Person");
		
		// 获取无参数构造方法
		Constructor ctr1 = c.getConstructor();
		
		// 调用无参数构造方法
		Person p1 = (Person) ctr1.newInstance(null);
		
		// 获取有参数构造方法 ,(字节码文件对象)
		Constructor ctr2 = c.getConstructor(String.class);
		
		// 调用有参数构造方法
		// 通过构造器对象创建对象
		Person p2 = (Person) ctr2.newInstance("david");
		
		// 获取所有的构造方法
		Constructor[] ctrs = c.getConstructors();
		for (Constructor ctrOne : ctrs) {
			System.out.println(ctrOne);
		}
	
		
		// 获取私有构造方法
		Constructor ctr3 = c.getDeclaredConstructor(String.class, String.class);
		// 设置可见性
		ctr3.setAccessible(true);
		// 调用构造函数，实例化对象
		Person p3 = (Person) ctr3.newInstance("david", "man");
		// 调用person的方法
		p3.show();

		System.out.println("=====================================");
		
		// 获取成员变量
		Field[] f1 = c.getFields();
		for (Field ff : f1) {
			System.out.println(ff);
		}

		System.out.println("=====================================");
		Field[] f2 = c.getDeclaredFields();
		for (Field ff : f2) {
			System.out.println(ff);
		}

		System.out.println("=======================================");

		// 获取单个成员变量
		Field fieldName = c.getField("name");
		fieldName.set(p3, "alice");
		p3.show();

		System.out.println("=======================================");

		Field fieldSex = c.getDeclaredField("sex");
		fieldSex.setAccessible(true);
		fieldSex.set(p3, "wm");
		p3.show();
		
		System.out.println("=======================================");
		
		// 获取所有的方法
		Method[] methodsOne = c.getMethods(); // 获取自己的包括父类的所有方法
		
		for (Method m : methodsOne) {
			System.out.println(m);
		}
		
		System.out.println("=======================================");
		
		Method[] methodsTwo = c.getDeclaredMethods(); // 获取自己所有的方法
		for (Method m : methodsTwo) {
			System.out.println(m);
		}
		
		System.out.println("=======================================");
		
		// public Method getMethod(String name,Class<?>... parameterTypes)
		// public Object invoke(Object obj,Object... args)
	    // 获取单个方法，并且调用
		Method mOne = c.getMethod("show");
        mOne.invoke(p3);
        
        System.out.println("=======================================");
        
        Method mTwo = c.getDeclaredMethod("printName", String.class);
        mTwo.setAccessible(true);
        mTwo.invoke(p3, "hello word");
        
	}
}
