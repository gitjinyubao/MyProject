package InetAddress之IP地址;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class A {
	public static void main(String[] args) throws UnknownHostException  {
		// TODO Auto-generated method stub
		InetAddress address=InetAddress.getLocalHost();
		System.out.println("计算机名："+address.getHostName());
		System.out.println("IP地址："+address.getHostAddress());
		byte [] b=address.getAddress();//获取字节数组形式的IP地址
		System.out.println("字节数组形式的IP:"+Arrays.toString(b));
		System.out.println(address);//直接输出InetAddress对象
		System.out.println();
		//根据机器名获取InetAddress实例
		InetAddress address1=InetAddress.getByName("USER-20160608LK");
		System.out.println("计算机名："+address1.getHostName());
		System.out.println("IP地址："+address1.getHostAddress());
		//根据机器IP地址获取InetAddress实例
		System.out.println();
		InetAddress address2=InetAddress.getByName("119.98.115.172");
		System.out.println("计算机名："+address2.getHostName());
		System.out.println("IP地址："+address2.getHostAddress());
	}
}
