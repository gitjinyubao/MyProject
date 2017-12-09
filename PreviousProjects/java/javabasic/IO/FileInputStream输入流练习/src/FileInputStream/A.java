package FileInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class A {
    /**
     * 类（InputStream）的具体实现类(读)
     * @param args
     * @throws IOException 
     */
	public static void c(File name) throws IOException
	{
		FileInputStream s1=new FileInputStream(name);
		RandomAccessFile r=new RandomAccessFile(name,"rw");
		byte [] b=new byte[(int)r.length()];//不浪费开辟的空间
		int i;
		int j=1;
		while((i=(s1.read()))!=-1)
		{
			if(i<=0xf)
				System.out.print("0");
			    System.out.print(Integer.toHexString((i)&0xff)+"  ");
			    if((j++)%10==0)
			    {
			    	System.out.println();
			    }
		}
		
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File name=new File("D:\\金宝\\jin.txt");
		A.c(name);
    
	}
}
