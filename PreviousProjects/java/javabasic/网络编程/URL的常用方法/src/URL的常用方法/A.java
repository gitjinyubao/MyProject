package URL的常用方法;

import java.net.MalformedURLException;
import java.net.URL;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建一个URL实例
		try {
			URL u = new URL ("http://www.jinyubao.com");
			//根据已经存在的URL创建新的URL对象
			URL  u1=new URL(u,"/baobei.html?name=jinyubao#text");
			//?后面表示参数，#后面表示参数
			System.out.println("协议："+u1.getProtocol());
			System.out.println("主机："+u1.getHost());
			System.out.println("端口："+u1.getPort());
			//如果未指定端口号，则使用默认的端口号，此时getport()返回值为-1
			System.out.println("文件路径："+u1.getPath());
			System.out.println("文件名："+u1.getFile());
			System.out.println("相对路径："+u1.getRef());
			System.out.println("查询字符串："+u1.getQuery());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
