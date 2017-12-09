package huanchong;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A {
	public static void c(File name,File name2) throws IOException
	{
		BufferedOutputStream b1=new BufferedOutputStream(new FileOutputStream(name));
		BufferedInputStream b=new BufferedInputStream(new FileInputStream(name2));
		int i;
		while((i=b.read())!=-1)
		{
			b1.write(i);
			b1.flush();
		}
		b1.close();
		b.close();
	}
//	public static void d(File name1)
//	{
//		BufferedOutputStream 
//	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
        A.c(new File("D:\\mp3\\fuzhi_³ÂÏè - ÑÌ»ð.mp3"), new File("D:\\mp3\\³ÂÏè - ÑÌ»ð.mp3"));
        
	}
}