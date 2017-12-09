package 服务器端;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class B {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c=new C();
		c.start();

	}
}
class  C extends  Thread
{
	public C()
	{
		
	}
	public void run()
	{
		try {
			ServerSocket s=new ServerSocket(7739);   
                        System.out.println("正在等待链接：");
			Socket  s1=s.accept();
			BufferedReader  b=new BufferedReader(new InputStreamReader(s1.getInputStream()));
			while(true)
			{
				if(s.isBound()==true)
				{
					System.out.println("链接中：");
					break;
				}
			}
		    while(true)
		    {
		    	String  s2=b.readLine();
		    	if(s2.length()>0)
		    	System.out.println("serve端已接收消息："+s2);
		    }
		    
			    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
