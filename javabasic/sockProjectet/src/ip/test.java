package ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * ��������Ҫ�أ�
 *            A:IP��ַ
 *            B:�˿ں�
 *            C:Э��
 * IP��ַ:
 *      �����м������Ψһ��ʶ
 */
public class test {
	
	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress id = InetAddress.getByName("DESKTOP-BJE3HIU");
		
		System.out.println(id.getHostAddress() + ":" +id.getHostName());
	}
}
