package org.interfaces.implement;
import org.interfaces.IHello;
public class Test {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ӿ��͵ı������Զ�Ӧ�κμ̳д˽ӿڵĶ���
		/*��һ�ַ�������̬����ʽ
		IHello hello=new ProxyHello(new Hello());*/
		
		//�ڶ��ַ�������̬����
		DynamicProxy proxy=new    DynamicProxy();
		IHello hello=(IHello)proxy.bind(new Hello());
		hello.sayHello1();
		hello.sayHello2();
		hello.sayHello3();
	}
}
