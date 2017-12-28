package classReflex;

import java.security.PermissionCollection;

/*
 * 动态获取对象信息，动态调用对象的方法的功能成为java的反射机制
 * 通过class文件对象，使用该文件的成员变量，构造方法和成员方法
 * 
 * 使用：
 *     要想这样使用，首先你必须得到class文件对象，其实就是Class类的对象
 *     Class类：
 *            成员变量  Field
 *            构造方法  Constractor
 *            成员方法  Method
 *            
 * 得到class文件对象的方式：
 *    1. Object.getClass()方法
 *    2. 数类型的静态属性class
 *    3. Class类中的静态方法forName()
 *    
 * 到底使用谁？
 * 1. 自己玩：任选
 * 2. 开发： 第三种
 *    为什么？因为第三种是一个字符串，而不是一个具体的类名，这样我们就可以吧这样的字符串配置在文件中
 */
public class ReflexDemo {
	
	public static void main(String[] args) throws ClassNotFoundException {
	    // 方式一
		Person p1 = new Person();
		Class c1 = p1.getClass();
		
		Person p2 = new Person();
		Class c2 = p1.getClass();
		
		System.out.println(p2==p1);
		System.out.println(c1==c2);
		
		System.out.println("=====================================");
		
		// 方式二
		Class c3 = Person.class;
		System.out.println(c1==c3);
		
		System.out.println("====================================");
		
		// 方式三
		Class c4 = Class.forName("classReflex.Person");
		System.out.println(c1==c4);
	}
}
