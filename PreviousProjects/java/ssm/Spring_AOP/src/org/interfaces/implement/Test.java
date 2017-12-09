package org.interfaces.implement;
import org.interfaces.IHello;
public class Test {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//接口型的变量可以对应任何继承此接口的对象
		/*第一种方法：静态代理方式
		IHello hello=new ProxyHello(new Hello());*/
		
		//第二种方法：动态代理
		DynamicProxy proxy=new    DynamicProxy();
		IHello hello=(IHello)proxy.bind(new Hello());
		hello.sayHello1();
		hello.sayHello2();
		hello.sayHello3();
	}
}
