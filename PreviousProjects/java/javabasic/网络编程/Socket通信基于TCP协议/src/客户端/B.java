package �ͻ���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class B{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c= new C();
		c.start();
	}
}
class C extends  Thread
{
	public  C()
	{
		
	}
	public  void run()
	{
		try {
			Socket  s=new Socket("127.0.0.1",7739);
			InputStream i=s.getInputStream();
			InputStreamReader i1=new InputStreamReader(i);//���ֽ���ת��Ϊ�ַ���
			BufferedReader   b= new BufferedReader(i1);//���������
			String s5=null;
			while((s5=b.readLine())!=null)
			{
				System.out.println(s5);
			}
			System.out.println("�뷢����Ϣ���������ˣ�");
			PrintWriter p=new PrintWriter(s.getOutputStream(),true);
			    while(true)
			    {
			    	if(s.isConnected()==true)
			    	{
			    		System.out.println("�����У�");
			    		break;
			    	}
			    }
			    while(true)
			    {
			    	
			    	 BufferedReader  b1= new BufferedReader(new InputStreamReader(System.in));
			    	 System.out.println("��������Ϣ��");
			    	 String s1=b1.readLine();
			    	 p.write(s1+"\n");
			    	 p.flush();	
			    }
			    
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
