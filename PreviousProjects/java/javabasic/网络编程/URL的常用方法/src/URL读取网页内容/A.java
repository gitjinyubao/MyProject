package URL��ȡ��ҳ����;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * ʹ��URL��ȡ��ҳ����
 * @author Administrator
 *
 */
public class A {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
			URL u=new URL("http://www.jikexueyuan.com");
			//ͨ��URL��openStream()������ȡURL��������ʾ����Դ���ֽ�������
			try {
				InputStream  is=u.openStream();
				BufferedInputStream   b3=new BufferedInputStream(is);
				BufferedOutputStream  b2=new BufferedOutputStream(new OutputStream(new File("c.txt")));
				//���ֽ�������ת��Ϊ�ַ�������
				InputStreamReader  in=new  InputStreamReader(is,"utf-8");
				//Ϊ�ַ���������ӻ���
				BufferedReader b= new BufferedReader(in);
				//BufferedWriter b1=new BufferedWriter(new FileWriter("c.txt"));
				String  data;
				while((data=b.readLine())!=null)//ѭ����ȡ����
				{
				    //b1.newLine();
					System.out.println(data);//�������
				}
				
				
				is.close();
				b.close();
				in.close();	
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   
	}
}
