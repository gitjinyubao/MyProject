package com.sunny.server;

import java.io.*;
import java.net.*;

/*
 * 模拟一个web服务器
 */
public class Server {
	public static void main(String[] args) throws IOException {
		
		// 监听应用程序的端口号 
		ServerSocket server = new ServerSocket(9999);
		// 接受客户端的请求，并反馈一个客户端socket 
		Socket socket = server.accept();
		// 获取资源的输出字节流
		FileInputStream in = new FileInputStream("F:\\Myeclipse  10\\Myeclipse 10\\understandingWebServer\\src\\com\\sunny\\test\\a.html");
		// 获取资源的输入流，写入内存
		OutputStream out = socket.getOutputStream();
		
		// 读取资源并且写入内存
		int len = 0;
		byte buffer[] = new byte[1024];
		
		while((len = in.read(buffer)) > 0) {
			out.write(buffer, 0, len);
		}
		
		// 关闭资源
		in.close();
		out.close();
		socket.close();
		server.close();
		
		// 浏览器中输入：http://localhost:9999/
	}
}
