package �ͻ���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class CA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket   s=new  Socket("127.0.0.1", 9992);
			System.out.println("������ͻ��˽������ӡ�����������������������");
			PrintWriter  p=new   PrintWriter(s.getOutputStream(), true);   
			BufferedReader  b=new BufferedReader(new InputStreamReader(System.in));
			while(true)
			{
				if(s.isConnected()==true)
				{
					System.out.println("�ͻ����Ѿ�������������ϡ�������������������������������");
					break;
				}
			}
			while(true)
			{
				String s3=null;
				s3=b.readLine();
				System.out.println("��������Ϣ��");
				p.write(s3+"\n");	
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
