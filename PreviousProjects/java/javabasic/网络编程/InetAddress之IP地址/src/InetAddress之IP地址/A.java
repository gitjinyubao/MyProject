package InetAddress֮IP��ַ;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class A {
	public static void main(String[] args) throws UnknownHostException  {
		// TODO Auto-generated method stub
		InetAddress address=InetAddress.getLocalHost();
		System.out.println("���������"+address.getHostName());
		System.out.println("IP��ַ��"+address.getHostAddress());
		byte [] b=address.getAddress();//��ȡ�ֽ�������ʽ��IP��ַ
		System.out.println("�ֽ�������ʽ��IP:"+Arrays.toString(b));
		System.out.println(address);//ֱ�����InetAddress����
		System.out.println();
		//���ݻ�������ȡInetAddressʵ��
		InetAddress address1=InetAddress.getByName("USER-20160608LK");
		System.out.println("���������"+address1.getHostName());
		System.out.println("IP��ַ��"+address1.getHostAddress());
		//���ݻ���IP��ַ��ȡInetAddressʵ��
		System.out.println();
		InetAddress address2=InetAddress.getByName("119.98.115.172");
		System.out.println("���������"+address2.getHostName());
		System.out.println("IP��ַ��"+address2.getHostAddress());
	}
}
