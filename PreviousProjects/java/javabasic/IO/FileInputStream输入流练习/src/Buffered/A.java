package Buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class A {
	public static void C(File name,File name1) throws IOException
	{
		BufferedInputStream b=new BufferedInputStream(new FileInputStream(name));
		BufferedOutputStream b1=new BufferedOutputStream(new FileOutputStream(name1));
		byte b2[]=new byte[(int)name.length()];
		b.read(b2, 0, b2.length);
		b1.write(b2, 0, b2.length);
		b1.flush();//缓冲池必须要弄这个
		b1.close();
		b.close();
		
		
//		int c;
//		while((c=b.read())!=-1)
//		{
//			b1.write(c);
//			b1.flush();//刷新
//		}
		
		
		
	}
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
           File name=new File("D:\\美文\\a.txt");
           File name1=new File("D:\\美文\\a3.txt");
           if(!(name1.exists()))
           {
        	   name1.createNewFile();
           }
           long start=System.currentTimeMillis();
           A.C(name, name1);
           long end=System.currentTimeMillis();
           System.out.println(end-start);
           
	}

}
