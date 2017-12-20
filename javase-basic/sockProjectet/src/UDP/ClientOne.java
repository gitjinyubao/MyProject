package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * UDPЭ��������ݣ�
 *              A: �������ն�socket���� :DatagramSocket
 *              B: ����һ�����ݰ�����������
 *              C: ����socket����Ľ������ݵķ���
 *              D: �������ݰ�
 *              E: �ͷ���Դ
 */
public class ClientOne {
	
	public static void main(String[] args) throws IOException {
		
		// ����DatagramSocket����
		DatagramSocket ds = new DatagramSocket(5678, InetAddress.getByName("DESKTOP-BJE3HIU"));
		
		// �������ݰ�
		DatagramPacket dp = new DatagramPacket(new byte[1024], new byte[1024].length);
		
		// �������ݰ�
		ds.receive(dp);
		
		// �ر���Դ
		ds.close();
		
		// �������ݰ�
		String s = new String(dp.getData(), 0, dp.getData().length); // ���ֽ�ת��Ϊ�ַ���
		
		// ��ʾ����̨
		System.out.println(s);
	}
}
