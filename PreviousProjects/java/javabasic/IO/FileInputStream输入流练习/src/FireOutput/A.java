package FireOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class A {
	/**
	 * 类（Output）的具体实现类（写）
	 * @param args
	 * @throws IOException 
	 */
	public static void c(File name) throws IOException
	{
		FileOutputStream f1=new FileOutputStream(name);
	    f1.write('A');
	    f1.write('B');
	    f1.write('1');
	    String s="10";
	    byte [] b=s.getBytes("gbk");
	    f1.write(b);
	    String s1="中国";
	    byte [] b1=s1.getBytes("gbk");
	    f1.write(b1);
	    
	    FileInputStream f2=new FileInputStream(name);
	    int i;
	    int j=1;
	    while((i=f2.read())!=-1)
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
	public static void j (File name2,File name1) throws IOException
	   {
		   FileOutputStream f2=new FileOutputStream(name2);
		   
		   FileInputStream f3=new FileInputStream(name1);
		   int i;
		   while((i=f3.read())!=-1)
		   {
			   f2.write(i);
		   }		   
	   }
	public static void k(File name2,File name1) throws IOException
	{
		FileOutputStream f4=new FileOutputStream(name2);
		   
		FileInputStream f5=new FileInputStream(name1);
		byte [] b5=new byte[(int)name1.length()];
		int c;
		while((c=f5.read(b5, 0, b5.length))!=-1)
		{
			f4.write(b5, 0, c);
			f4.flush();
		}
		f4.close();
		f5.close();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File name=new File("D:\\金玉波\\jyb.txt");
        A.c(name);
        File name1=new File("D:\\mp3\\周传雄 - 温柔的男人像海洋.mp3");
        if(!(name1.exists()))
        {
        	System.out.println("不存在此目录");
        }
        File name2=new File ("D:\\金玉波\\jinyubao.mp3");//复制的时候不需要用Creat创建
        long start=System.currentTimeMillis();
        //A.k(name2, name1);
          A.j(name2, name1);
        long end=System.currentTimeMillis();
        System.out.println();
        System.out.println(end-start);
	}
}
