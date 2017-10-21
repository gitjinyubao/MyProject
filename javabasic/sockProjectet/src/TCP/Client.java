package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
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
		
		// 获取输出流,写数据：public OutputStream getOutputStream()
		OutputStream o = s.getOutputStream(); // 获取通道内的输出流
		o.write("hello word".getBytes());
		
		// 获取输入流
		byte[] by = new byte[1024];
		InputStream i = s.getInputStream();
	    int length = i.read(by);
	    String message = new String(by, 0, length);
	    System.out.println(message);
	    
		//释放资源
		s.close();
	}
}
