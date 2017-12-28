package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * TCP协议：一定要先开启服务端
 * TCP协议接受数据:
 *             A：创建server端socket对象
 *             B：监听客户端连接，返回对应的socket对象
 *             C: 获取输入流，读取数据显示在控制台
 *             D: 释放资源
 */
public class Server {
	
	public static void main(String[] args) throws IOException {
		// 创建socket
		@SuppressWarnings("resource")
		ServerSocket ss = new ServerSocket(8888);
		
		// 监听连接，返回对应的socket对象
		Socket s = ss.accept(); // 阻塞式方法
		
		// 获取输入流
		InputStream i = s.getInputStream();
		byte[] by = new byte[1024];
		int len = i.read(by); // 阻塞式方法
		String message = new String(by, 0, len);
		System.out.println(message + s.getInetAddress());
		
		// 获得输出流
		OutputStream o = s.getOutputStream();
		o.write("数据已经接收".getBytes());
		
		// 关闭资源（客户端）
		s.close();
	}
}
