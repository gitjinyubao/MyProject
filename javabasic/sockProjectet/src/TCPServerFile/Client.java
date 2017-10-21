package TCPServerFile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/*
 * TCP协议发送数据：
 *             A: 创建发送端socket对象
 *                 这步成功，证明链接已经建立
 *             B: 获取输出流写数据
 *             C:释放资源
 *   
 */
public class Client {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		//创建发送端socket
		Socket s = new Socket("192.168.254.1", 8888); // 192.168.254.1服务器端IP
		
		// 键盘录入数据
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		// 把通道内的流包装一下
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
	    
		//释放资源
		s.close();
	}
}
