package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * UDP发送数据：
 *          A: 创建socket对象 DatagramSocket
 *          B: 待发数据
 *          C: 创建数据包
 *          D： socket对象调用send()方法发送数据
 *          C:释放资源
 */
public class ClientTwo {

	public static void main(String[] args) throws IOException {
		
		// 创建Socket对象
		DatagramSocket ds = new DatagramSocket(3456, InetAddress.getByName("DESKTOP-BJE3HIU"));
		
		// 准备发送的数据
		byte[] by = "hello!".getBytes();
		
		// 创建数据包
		DatagramPacket dp = new DatagramPacket(by, by.length, InetAddress.getByName("DESKTOP-BJE3HIU"), 5678);
		
		// 发送数据包
		ds.send(dp);
		
		// 释放资源
		ds.close();
	}
}
