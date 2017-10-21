package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * UDP�������ݣ�
 *          A: ����socket���� DatagramSocket
 *          B: ��������
 *          C: �������ݰ�
 *          D�� socket�������send()������������
 *          C:�ͷ���Դ
 */
public class ClientTwo {

	public static void main(String[] args) throws IOException {
		
		// ����Socket����
		DatagramSocket ds = new DatagramSocket(3456, InetAddress.getByName("DESKTOP-BJE3HIU"));
		
		// ׼�����͵�����
		byte[] by = "hello!".getBytes();
		
		// �������ݰ�
		DatagramPacket dp = new DatagramPacket(by, by.length, InetAddress.getByName("DESKTOP-BJE3HIU"), 5678);
		
		// �������ݰ�
		ds.send(dp);
		
		// �ͷ���Դ
		ds.close();
	}
}
