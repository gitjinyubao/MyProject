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
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//封装文本文件
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("a.txt"));
		
		String line = null;
		while ((line = bufferedReader.readLine()) != null) {
			bufferedWriter.write(line);
			bufferedWriter.newLine();
			bufferedWriter.flush();
		}
		
		// 关闭资源（客户端）
		s.close();
	}
}
