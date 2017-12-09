package 客户端;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class A {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
        try {
        	int port=3332;
			DatagramSocket d=new DatagramSocket();
			byte  [] b="中国人".getBytes();
			try {
				InetAddress address=InetAddress.getByName("localhost");
				DatagramPacket d1=new DatagramPacket(b, b.length, address,port);
				try {
					d.send(d1);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (UnknownHostException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
