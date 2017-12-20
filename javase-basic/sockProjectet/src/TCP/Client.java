package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * TCPЭ�鷢�����ݣ�
 *             A: �������Ͷ�socket����
 *                 �ⲽ�ɹ���֤�������Ѿ�����
 *             B: ��ȡ�����д����
 *             C:�ͷ���Դ
 *   
 */
public class Client {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		//�������Ͷ�socket
		Socket s = new Socket("192.168.254.1", 8888); // 192.168.254.1��������IP
		
		// ��ȡ�����,д���ݣ�public OutputStream getOutputStream()
		OutputStream o = s.getOutputStream(); // ��ȡͨ���ڵ������
		o.write("hello word".getBytes());
		
		// ��ȡ������
		byte[] by = new byte[1024];
		InputStream i = s.getInputStream();
	    int length = i.read(by);
	    String message = new String(by, 0, length);
	    System.out.println(message);
	    
		//�ͷ���Դ
		s.close();
	}
}
