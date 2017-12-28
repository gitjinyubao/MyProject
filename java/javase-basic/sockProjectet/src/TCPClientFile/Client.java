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
 * 自定义结束标记不好
 */
public class Client {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket("192.168.254.1", 8888);
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader("ClientSenxd.java"));
		
		// 将通道内的字节流包装成字符流
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		String line = null;
		
		while((line = bufferedReader.readLine()) != null) {
			bufferedWriter.write(line);
			bufferedWriter.newLine();
			bufferedWriter.flush();
		}
		
		// 自定义结束标记
		/*bufferedWriter.write("over");
		bufferedWriter.newLine();
		bufferedWriter.flush();*/
		
		// socket提供了一个终止功能 public void shutdownOutput()
        s.shutdownOutput();
		
		// 得到反馈信息
		BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
		System.out.println(bufferedReader1.readLine());
		
		s.close();
	}
}
