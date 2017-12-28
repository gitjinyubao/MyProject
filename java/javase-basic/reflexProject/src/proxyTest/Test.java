package proxyTest;

import java.lang.reflect.Proxy;

public class Test {
	
	public static void main(String[] args) {
		Student sd = new StudentImpl();
		
		MyInvocationHandler handler = new MyInvocationHandler(sd);
		
		// sd.getClass().getInterfaces(): 拿到它所有的接口对象
		// 获得代理对象
		Student proxy = (Student) Proxy.newProxyInstance(sd.getClass().getClassLoader(), sd.getClass().getInterfaces(), handler);
		
		proxy.login();
	}
}
