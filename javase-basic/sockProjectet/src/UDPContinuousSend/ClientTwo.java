package UDPContinuousSend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		
		// ����¼������
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		
		while ((line = bufferedReader.readLine()) != null) {
			// �������ݰ�
			byte[] by = line.getBytes();
			DatagramPacket dp = new DatagramPacket(by, by.length, InetAddress.getByName("DESKTOP-BJE3HIU"), 5678);
			
			// InetAddress.getByName("192.168.159.1") �޸�Ϊ InetAddress.getByName("192.168.159.255") ���㲥��ַ����
			
			// �������ݰ�
			ds.send(dp);
		}
		
		// �ͷ���Դ
		ds.close();
	}
}
