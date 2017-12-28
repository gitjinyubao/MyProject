package UDPThread;

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
public class ClientSend implements Runnable {
	private DatagramSocket ds;
	
	public ClientSend(DatagramSocket ds) {
		this.ds = ds;
	}
	
	@Override
	public void run() {
		try {
			// 键盘录入数据
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
			String line = null;
			
			while ((line = bufferedReader.readLine()) != null) {
				// 创建数据包
				byte[] by = line.getBytes();
				DatagramPacket dp = new DatagramPacket(by, by.length, InetAddress.getByName("DESKTOP-BJE3HIU"), 5678);
				
				// 发送数据包
				ds.send(dp);
			}
			
			// 释放资源
			ds.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
