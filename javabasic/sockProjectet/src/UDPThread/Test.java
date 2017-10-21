package UDPThread;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Test {
	
	public static void main(String[] args) throws SocketException, UnknownHostException {
		DatagramSocket dsSend = new DatagramSocket();
		DatagramSocket dsRecevie = new DatagramSocket(5678);
		
		Thread send = new Thread(new ClientSend(dsSend));
		Thread recevie = new Thread(new ClientReceive(dsRecevie));
		
		recevie.start();
		send.start();
	}
}
