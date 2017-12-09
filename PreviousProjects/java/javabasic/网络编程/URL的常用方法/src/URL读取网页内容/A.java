package URL读取网页内容;
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
 * 使用URL读取网页内容
 * @author Administrator
 *
 */
public class A {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
			URL u=new URL("http://www.jikexueyuan.com");
			//通过URL的openStream()方法获取URL对象所表示的资源的字节输入流
			try {
				InputStream  is=u.openStream();
				BufferedInputStream   b3=new BufferedInputStream(is);
				BufferedOutputStream  b2=new BufferedOutputStream(new OutputStream(new File("c.txt")));
				//将字节输入流转化为字符输入流
				InputStreamReader  in=new  InputStreamReader(is,"utf-8");
				//为字符输入流添加缓冲
				BufferedReader b= new BufferedReader(in);
				//BufferedWriter b1=new BufferedWriter(new FileWriter("c.txt"));
				String  data;
				while((data=b.readLine())!=null)//循环读取数据
				{
				    //b1.newLine();
					System.out.println(data);//输出数据
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
