package com.sunny.server;

import java.io.*;
import java.net.*;

/*
 * ģ��һ��web������
 */
public class Server {
	public static void main(String[] args) throws IOException {
		
		// ����Ӧ�ó���Ķ˿ں� 
		ServerSocket server = new ServerSocket(9999);
		// ���ܿͻ��˵����󣬲�����һ���ͻ���socket 
		Socket socket = server.accept();
		// ��ȡ��Դ������ֽ���
		FileInputStream in = new FileInputStream("F:\\Myeclipse  10\\Myeclipse 10\\understandingWebServer\\src\\com\\sunny\\test\\a.html");
		// ��ȡ��Դ����������д���ڴ�
		OutputStream out = socket.getOutputStream();
		
		// ��ȡ��Դ����д���ڴ�
		int len = 0;
		byte buffer[] = new byte[1024];
		
		while((len = in.read(buffer)) > 0) {
			out.write(buffer, 0, len);
		}
		
		// �ر���Դ
		in.close();
		out.close();
		socket.close();
		server.close();
		
		// ����������룺http://localhost:9999/
	}
}
