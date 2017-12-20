package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * TCPЭ�飺һ��Ҫ�ȿ��������
 * TCPЭ���������:
 *             A������server��socket����
 *             B�������ͻ������ӣ����ض�Ӧ��socket����
 *             C: ��ȡ����������ȡ������ʾ�ڿ���̨
 *             D: �ͷ���Դ
 */
public class Server {
	
	public static void main(String[] args) throws IOException {
		// ����socket
		@SuppressWarnings("resource")
		ServerSocket ss = new ServerSocket(8888);
		
		// �������ӣ����ض�Ӧ��socket����
		Socket s = ss.accept(); // ����ʽ����
		
		// ��ȡ������
		InputStream i = s.getInputStream();
		byte[] by = new byte[1024];
		int len = i.read(by); // ����ʽ����
		String message = new String(by, 0, len);
		System.out.println(message + s.getInetAddress());
		
		// ��������
		OutputStream o = s.getOutputStream();
		o.write("�����Ѿ�����".getBytes());
		
		// �ر���Դ���ͻ��ˣ�
		s.close();
	}
}
