package zijiezifu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A {
	public static void j(File name1,File name) throws IOException
	{
		InputStreamReader i=new InputStreamReader (new FileInputStream(name),"gbk");
		//注意后面有个参数指明编码方式
	    OutputStreamWriter o=new OutputStreamWriter(new FileOutputStream (name1));
	    int c;
	    /**
	     * 读取文件内容
//	     */
//	    while((c=i.read())!=-1)
//	    {
//	    	System.out.println((char)c);
//	    }
//	    System.out.println();
	    /**
	     * 批量读取
	     */
	    int h;
	    char [] b=new char[290*1024];
	    while((h=i.read(b, 0, b.length))!=-1)
	    {
	    	String s=new String(b, 0, h);
	    	System.out.print(s);//char字符组转化为字符串
	    	o.write(b,0,h);
	    	o.close();
		    i.close();
	    }
	    System.out.println();
	    /**
	     * 复制文件
	     */
	    int h1;
//	    while((h1=i.read())!=-1)
//	    {
//	    	o.write(h1);
//	    	o.flush();	
//	    }	
	    o.close();
	    i.close();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File name=new File("D:\\美文\\a3.txt");
		File name1=new File("D:\\fuzhi.txt");
		if(!(name1.exists()))
		{
			 name1.createNewFile();
		}
		A.j(name1, name);
	}
}
