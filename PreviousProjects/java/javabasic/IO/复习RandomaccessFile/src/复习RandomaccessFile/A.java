package ¸´Ï°RandomaccessFile;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class A {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        File f=new File("D:\\fuxi");
        if(!(f.exists()))
        {
        	f.mkdirs();
        }
        File f1=new File("D:\\fuxi","a.txt");
        if(!(f1.exists()))
        {
        	f1.createNewFile();
        }
        RandomAccessFile raf=new RandomAccessFile(f1,"rw");
        System.out.println(raf.getFilePointer());
        raf.writeInt('2');
        raf.write('b');
        String s="ÖÐ¹ú";
        byte [] b3=s.getBytes("gbk");
        raf.writeChars(s);
        System.out.println(raf.getFilePointer());
        File f2=new File("D:\\fuxi","b.txt");
        if(!(f2.exists()))
        {
        	f2.createNewFile();
        }
        RandomAccessFile raf1=new RandomAccessFile(f2,"rw");
        int b=0;
        byte [] b2=new byte[(int)raf.length()];
        raf.seek(0);
        for(;b<raf.read(b2, 0, b2.length);++b)
        {
        	raf1.write(b2, 0,b );
        } 
//        raf.read(b2);
//        raf1.write(b2);
	}

}
