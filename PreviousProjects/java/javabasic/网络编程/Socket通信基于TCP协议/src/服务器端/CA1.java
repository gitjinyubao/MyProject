package ��������;

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
			System.out.println("�ȴ��ͻ��˵����ӡ�����������������������");
			Socket  s1=s.accept();
			//������Ϣ
			BufferedReader    b=new BufferedReader(new InputStreamReader(s1.getInputStream()));
			while(true)//ѭ������
			{
				if(s1.isConnected()==true)
				{
					System.out.println("��ͻ����Ѿ�����");
				}
				break;
			}
			String s2=null;
			while((s2=b.readLine())!=null)
			{
				System.out.println("���Ƿ����������յ�����ϢΪ��"+s2);
				//s1.close();//�ر�֮��Ͳ���������
			
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
