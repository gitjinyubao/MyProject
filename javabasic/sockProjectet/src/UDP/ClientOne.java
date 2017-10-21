package UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 * UDP协议接收数据：
 *              A: 创建接收端socket对象 :DatagramSocket
 *              B: 创建一个数据包（接收器）
 *              C: 调用socket对象的接受数据的方法
 *              D: 解析数据包
 *              E: 释放资源
 */
public class ClientOne {
	
	public static void main(String[] args) throws IOException {
		
		// 创建DatagramSocket对象
		DatagramSocket ds = new DatagramSocket(5678, InetAddress.getByName("DESKTOP-BJE3HIU"));
		
		// 创建数据包
		DatagramPacket dp = new DatagramPacket(new byte[1024], new byte[1024].length);
		
		// 接收数据包
		ds.receive(dp);
		
		// 关闭资源
		ds.close();
		
		// 解析数据包
		String s = new String(dp.getData(), 0, dp.getData().length); // 将字节转化为字符串
		
		// 显示控制台
		System.out.println(s);
	}
}
