package UDPContinuousSend;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
		
		// 键盘录入数据
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		
		while ((line = bufferedReader.readLine()) != null) {
			// 创建数据包
			byte[] by = line.getBytes();
			DatagramPacket dp = new DatagramPacket(by, by.length, InetAddress.getByName("DESKTOP-BJE3HIU"), 5678);
			
			// InetAddress.getByName("192.168.159.1") 修改为 InetAddress.getByName("192.168.159.255") ：广播地址发送
			
			// 发送数据包
			ds.send(dp);
		}
		
		// 释放资源
		ds.close();
	}
}
