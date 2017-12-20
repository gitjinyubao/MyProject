package TCPClientFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * �Զ��������ǲ���
 */
public class Client {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("192.168.254.1", 8888);
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("ClientSenxd.java"));
		
		// ��ͨ���ڵ��ֽ�����װ���ַ���
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		String line = null;
		
		while((line = bufferedReader.readLine()) != null) {
			bufferedWriter.write(line);
			bufferedWriter.newLine();
			bufferedWriter.flush();
		}
		
		// �Զ���������
		/*bufferedWriter.write("over");
		bufferedWriter.newLine();
		bufferedWriter.flush();*/
		
		// socket�ṩ��һ����ֹ���� public void shutdownOutput()
        s.shutdownOutput();
		
		// �õ�������Ϣ
		BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
		System.out.println(bufferedReader1.readLine());
		
		s.close();
	}
}
