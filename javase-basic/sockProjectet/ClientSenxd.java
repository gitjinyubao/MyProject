package UDPThread;

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
public class ClientSend implements Runnable {
	private DatagramSocket ds;
	
	public ClientSend(DatagramSocket ds) {
		this.ds = ds;
	}
	
	@Override
	public void run() {
		try {
			// ����¼������
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			String line = null;
			
			while ((line = bufferedReader.readLine()) != null) {
				// �������ݰ�
				byte[] by = line.getBytes();
				DatagramPacket dp = new DatagramPacket(by, by.length, InetAddress.getByName("DESKTOP-BJE3HIU"), 5678);
				
				// �������ݰ�
				ds.send(dp);
			}
			
			// �ͷ���Դ
			ds.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
