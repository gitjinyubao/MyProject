package ��������;

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
			System.out.println("�ȴ��ͻ������󡤡�������������������");
			Socket   s1=s.accept();
			BufferedReader b=new BufferedReader(new InputStreamReader(s1.getInputStream()));
			while(true)
			{
				if(s.isBound()==true)
				{
					System.out.println("�����У�");
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
					   System.out.println("�ͻ���˵��"+s2);
				   }
//				   System.out.println("������������Ϣ������������������");
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
