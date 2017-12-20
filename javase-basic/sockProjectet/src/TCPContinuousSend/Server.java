package TCPContinuousSend;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
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
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String message = null;
		
		while ((message = bufferedReader.readLine()) != null) {
			if ("88".equals(message)) {
				break;
			}
			System.out.println(message + s.getInetAddress());
		}
		
		// ��������
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		bufferedWriter.write("�յ�������");
		bufferedWriter.newLine();
		bufferedWriter.flush();
		
		// �ر���Դ���ͻ��ˣ�
		s.close();
	}
}
