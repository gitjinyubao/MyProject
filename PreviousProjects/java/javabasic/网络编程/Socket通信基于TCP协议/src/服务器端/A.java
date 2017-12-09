package 服务器端;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 实现用户登录
 * @author Administrator
 *
 */
public class A {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建ServeSocket对象，绑定监听端口
		try {
			ServerSocket s1=new ServerSocket(8883);
		//创建accept()方法监听客户端的请求
			System.out.println("******服务器即将启动，等待客户端请求********");
			Socket s2=s1.accept();//等待客户端的侦听
	    //建立连接后，通过输入流读取客户端发送的请求信息
			InputStream  i=s2.getInputStream();//字节输入流
			InputStreamReader   i1=new InputStreamReader(i);//将字节流转化为字符流
			BufferedReader b=new BufferedReader(i1);//为输入流添加缓冲
			String  s=null;
			while((s=b.readLine())!=null)
			{
				System.out.println("我是服务器，客户端说："+s);
			}
			s2.shutdownInput();//关闭输入流
			//对客户端响应
			OutputStream o=s2.getOutputStream();
			PrintWriter p=new PrintWriter(o);
			p.write("欢迎客户端");
			p.flush();
			p.close();
			o.close();
			//关闭资源
			b.close();
			i.close();
			i1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
