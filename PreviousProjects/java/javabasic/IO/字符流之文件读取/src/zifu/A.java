package zifu;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class A {
	public static void j(File name1,File name) throws IOException
	{
		FileReader f1=new FileReader(name1);
		FileWriter f2=new FileWriter(name);
		char [] c=new char[200*1024];
		int c1;
		/**
		 * 批量读取复制
		 */
		 while((c1=f1.read(c, 0, c.length))!=-1)
		 {
			 String s=new String(c, 0, c1);
			 System.out.print(s);
//			 f2.write(c, 0, c1);
//			 f2.flush();
		 }
		 f1.close();
		 f2.close();
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File name=new File("D:\\美文\\fuzhi.txt");
		File name1=new File("D:\\fuzhi1.txt");
		if(!(name1.exists()))
		{
			 name1.createNewFile();
		}
		A.j(name1, name);

	}

}
