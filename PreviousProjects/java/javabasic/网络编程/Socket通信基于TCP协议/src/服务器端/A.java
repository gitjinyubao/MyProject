package ��������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ʵ���û���¼
 * @author Administrator
 *
 */
public class A {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ServeSocket���󣬰󶨼����˿�
		try {
			ServerSocket s1=new ServerSocket(8883);
		//����accept()���������ͻ��˵�����
			System.out.println("******�����������������ȴ��ͻ�������********");
			Socket s2=s1.accept();//�ȴ��ͻ��˵�����
	    //�������Ӻ�ͨ����������ȡ�ͻ��˷��͵�������Ϣ
			InputStream  i=s2.getInputStream();//�ֽ�������
			InputStreamReader   i1=new InputStreamReader(i);//���ֽ���ת��Ϊ�ַ���
			BufferedReader b=new BufferedReader(i1);//Ϊ��������ӻ���
			String  s=null;
			while((s=b.readLine())!=null)
			{
				System.out.println("���Ƿ��������ͻ���˵��"+s);
			}
			s2.shutdownInput();//�ر�������
			//�Կͻ�����Ӧ
			OutputStream o=s2.getOutputStream();
			PrintWriter p=new PrintWriter(o);
			p.write("��ӭ�ͻ���");
			p.flush();
			p.close();
			o.close();
			//�ر���Դ
			b.close();
			i.close();
			i1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
