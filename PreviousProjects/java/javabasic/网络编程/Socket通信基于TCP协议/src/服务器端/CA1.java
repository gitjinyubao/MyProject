package 服务器端;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class CA1 {   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Serve1 c=new Serve1();
        c.start();
	}
}
class  Serve1  extends   Thread
{
	public Serve1()
	{	
	}
	public void run()
	{
		try {
			
			ServerSocket  s=new  ServerSocket(9992);
			System.out.println("等待客户端的连接············");
			Socket  s1=s.accept();
			//接收消息
			BufferedReader    b=new BufferedReader(new InputStreamReader(s1.getInputStream()));
			while(true)//循环侦听
			{
				if(s1.isConnected()==true)
				{
					System.out.println("与客户端已经连接");
				}
				break;
			}
			String s2=null;
			while((s2=b.readLine())!=null)
			{
				System.out.println("我是服务器，接收到的消息为："+s2);
				//s1.close();//关闭之后就不能连接了
			
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
