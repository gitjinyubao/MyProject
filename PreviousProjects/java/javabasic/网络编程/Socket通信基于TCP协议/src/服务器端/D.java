package 服务器端;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket  s=new ServerSocket(5543);
			System.out.println("等待客户端请求···········");
			Socket   s1=s.accept();
			BufferedReader b=new BufferedReader(new InputStreamReader(s1.getInputStream()));
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
//				   BufferedReader b1=new BufferedReader(new InputStreamReader(System.in));
//				   PrintWriter  p=new PrintWriter(s1.getOutputStream(),true);
				   String s2=null;
				   if((s2=b.readLine())!=null)
				   {
					   System.out.println("客户端说："+s2);
				   }
//				   System.out.println("请服务端输入消息·········");
//				   if((s2=b1.readLine())!=null)
//				   {
//					   p.write(s2);
//				   }
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
