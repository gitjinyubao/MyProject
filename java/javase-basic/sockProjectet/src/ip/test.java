package ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * 网络编程三要素：
 *            A:IP地址
 *            B:端口号
 *            C:协议
 * IP地址:
 *      网络中计算机的唯一标识
 */
public class test {
	
	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress id = InetAddress.getByName("DESKTOP-BJE3HIU");
		
		System.out.println(id.getHostAddress() + ":" +id.getHostName());
	}
}
