package UDPThread;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
 * UDPЭ��������ݣ�
 *              A: �������ն�socket���� :DatagramSocket
 *              B: ����һ�����ݰ�����������
 *              C: ����socket����Ľ������ݵķ���
 *              D: �������ݰ�
 *              E: �ͷ���Դ
 */
public class ClientReceive implements Runnable {
	private DatagramSocket ds;
	
	public ClientReceive(DatagramSocket ds) {
		this.ds = ds;
	}

	@Override
	public void run() {
		try {
			while (true) {
				// �������ݰ�
				DatagramPacket dp = new DatagramPacket(new byte[1024], new byte[1024].length);
				
				// �������ݰ�
				ds.receive(dp);
				
				// �������ݰ�
				String s = new String(dp.getData(), 0, dp.getData().length); // ���ֽ�ת��Ϊ�ַ���
				
				// ��ʾ����̨
				System.out.println(s);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
