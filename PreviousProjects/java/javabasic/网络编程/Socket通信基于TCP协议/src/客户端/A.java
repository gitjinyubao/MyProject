package �ͻ���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
/**
 * ʵ���û���¼
 * @author Administrator
 *
 */
public class A {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //����Socket����ָ����Ҫ���ӵķ������ĵ�ַ�Ͷ˿ں�
		try {
			Socket s=new Socket("localhost", 8883);
		//���ӽ�����ͨ���������������˷���������Ϣ
			System.out.println("******���ӽ�����׼����������˷�������*****");
			OutputStream  o=s.getOutputStream();//�ֽ������
			PrintWriter p=new PrintWriter(o);//���������װΪ��ӡ��
			p.write("�˺ţ�1345551624,���룺123456");
     		p.flush();
		//ͨ����������ȡ��������Ӧ����Ϣ
			InputStream i=s.getInputStream();
			InputStreamReader i1=new InputStreamReader(i);//���ֽ���ת��Ϊ�ַ���
			BufferedReader   b= new BufferedReader(i1);//���������
			String s1=null;
			while((s1=b.readLine())!=null)
			{
				System.out.println("���ǿͻ��ˣ���ȡ�ķ������˵���Ӧ��ϢΪ��"+s1);
				s.shutdownInput();
			}
     		i1.close();
			b.close();
    		i.close();
			p.close();
			o.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
