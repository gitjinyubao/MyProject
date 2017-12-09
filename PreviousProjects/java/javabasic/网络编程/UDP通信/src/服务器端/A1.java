package ·þÎñÆ÷¶Ë;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DatagramSocket  d=new DatagramSocket(3332);
			byte [] b=new byte[2014];
			DatagramPacket p=new DatagramPacket(b, b.length);
			try {
				d.receive(p);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
