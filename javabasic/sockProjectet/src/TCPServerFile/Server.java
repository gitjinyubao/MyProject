package TCPServerFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
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
		
		//��װ�ı��ļ�
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("a.txt"));
		
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			bufferedWriter.write(line);
			bufferedWriter.newLine();
			bufferedWriter.flush();
		}
		
		// �ر���Դ���ͻ��ˣ�
		s.close();
	}
}
