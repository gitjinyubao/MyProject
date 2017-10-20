package proxyTest;

import java.lang.reflect.Proxy;

public class Test {
	
	public static void main(String[] args) {
		Student sd = new StudentImpl();
		
		MyInvocationHandler handler = new MyInvocationHandler(sd);
		
		// sd.getClass().getInterfaces(): �õ������еĽӿڶ���
		// ��ô������
		Student proxy = (Student) Proxy.newProxyInstance(sd.getClass().getClassLoader(), sd.getClass().getInterfaces(), handler);
		
		proxy.login();
	}
}
