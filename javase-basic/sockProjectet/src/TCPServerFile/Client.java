package TCPServerFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
		
		// ����¼������
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		// ��ͨ���ڵ�����װһ��
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			
			if ("88".equals(line)) {
				break;
			}
			
			bufferedWriter.write(line);
			bufferedWriter.newLine();
			bufferedWriter.flush();
		}
	    
		//�ͷ���Դ
		s.close();
	}
}
