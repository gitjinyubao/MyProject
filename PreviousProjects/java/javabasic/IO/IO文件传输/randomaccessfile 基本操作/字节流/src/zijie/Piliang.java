package zijie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Piliang {
	public static  void Byte(String filename) throws IOException
	{
		//准备一个具备一定容量的字节数组装入从f1中读取的字节
		byte [] b=new byte[2000*1024];
	    FileInputStream f1=new FileInputStream(filename);
	    int b1=f1.read(b, 0,b.length);//返回读到的字节个数
	    for(int i=1;i<=b1;i++)
	    {
	    	if(b[i]<0xf)
	    	{
	    		System.out.print("0");
	    	}
	    	System.out.print(Integer.toHexString(b[i])+"  ");
	    	if(i%10==0)
	    	{
	    		System.out.println();
	    	}
	    }
	 }
	public static void Piliang1(String name) throws IOException
	{
		FileInputStream f1=new FileInputStream(name);
		byte [] b=new byte[2000*1024];
		int b7=0;
		while((b7=f1.read(b, 0, b.length))!=-1)
		{
			for(int i=0;i<b7;i++)
			{
				System.out.print(Integer.toHexString(b[i]&0xff)+"  ");
				if(i%10==0)
		    	{
		    		System.out.println();
		    	}
			}
		}
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        //Piliang.Byte("D:\\test.txt");
		long start=System.currentTimeMillis();
        Piliang.Piliang1("D:\\test.txt");
        long end=System.currentTimeMillis();
        System.out.println();
        System.out.println(end-start);
	}

}
