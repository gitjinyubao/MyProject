package 客户端;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class D1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	System.out.println("准备与客户端接入··········");
		Socket   s=new Socket("127.0.0.1",5543);
		PrintWriter p=new PrintWriter(s.getOutputStream(),true);
		while(true)
		{
			if(s.isConnected()==true)
			{
				System.out.println("已经与服务端端连接·········");
				break;
			}
		}
		while(true)
		{
			BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
			String  s1=null;
//			BufferedReader   b1=new BufferedReader(new InputStreamReader(s.getInputStream()));
			System.out.println("请客户端输入信息··········");
			if((s1=b.readLine())!=null)
			{
				p.write(s1+"\n");
				p.flush();
			}	
//			if((s1=b1.readLine())!=null)
//			{
//				System.out.println("服务端说："+s1);
//			}
		}
	}  catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}

