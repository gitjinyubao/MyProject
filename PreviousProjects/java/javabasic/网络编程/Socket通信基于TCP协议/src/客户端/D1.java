package �ͻ���;

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
    	System.out.println("׼����ͻ��˽��롤������������������");
		Socket   s=new Socket("127.0.0.1",5543);
		PrintWriter p=new PrintWriter(s.getOutputStream(),true);
		while(true)
		{
			if(s.isConnected()==true)
			{
				System.out.println("�Ѿ������˶����ӡ�����������������");
				break;
			}
		}
		while(true)
		{
			BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
			String  s1=null;
//			BufferedReader   b1=new BufferedReader(new InputStreamReader(s.getInputStream()));
			System.out.println("��ͻ���������Ϣ��������������������");
			if((s1=b.readLine())!=null)
			{
				p.write(s1+"\n");
				p.flush();
			}	
//			if((s1=b1.readLine())!=null)
//			{
//				System.out.println("�����˵��"+s1);
//			}
		}
	}  catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}

