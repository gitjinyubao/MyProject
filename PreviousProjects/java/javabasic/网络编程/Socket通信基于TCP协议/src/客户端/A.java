package 客户端;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
/**
 * 实现用户登录
 * @author Administrator
 *
 */
public class A {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //创建Socket对象，指明需要连接的服务器的地址和端口号
		try {
			Socket s=new Socket("localhost", 8883);
		//连接建立后，通过输出流向服务器端发送请求消息
			System.out.println("******连接建立，准备向服务器端发送请求*****");
			OutputStream  o=s.getOutputStream();//字节输出流
			PrintWriter p=new PrintWriter(o);//将输出流包装为打印流
			p.write("账号：1345551624,密码：123456");
     		p.flush();
		//通过输入流获取服务器响应的消息
			InputStream i=s.getInputStream();
			InputStreamReader i1=new InputStreamReader(i);//将字节流转化为字符流
			BufferedReader   b= new BufferedReader(i1);//创建缓冲池
			String s1=null;
			while((s1=b.readLine())!=null)
			{
				System.out.println("我是客户端，获取的服务器端的响应消息为："+s1);
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
