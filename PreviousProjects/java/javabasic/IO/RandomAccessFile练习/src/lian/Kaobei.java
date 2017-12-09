package lian;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Kaobei {
	public static void kaobei(File name2,File name1) throws IOException
	{
		RandomAccessFile f1=new RandomAccessFile(name1,"rw");
		f1.write('1');
		f1.write('A');
		f1.write('B');
		String s="中国";
		byte[] b=s.getBytes("gbk");
		f1.write(b);//将b中内容写入	
		f1.seek(0);
        int y;
        byte [] b2=new byte[(int)f1.length()];
        f1.read(b2);//读入b2中
        /**
         * 复制
         */
        RandomAccessFile f2=new RandomAccessFile(name2,"rw");
        f2.write(b2);
        System.out.println(f2.equals(f1));
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("D:\\demo");
		if(!(f.exists()))
		{
			f.mkdirs();//建立目录
		}
		File name1=new File(f,"a.txt");
		if(!(name1.exists()))
		{
			name1.createNewFile();//建立文本
		}
		File name2=new File(f,"a1.txt");
		if(!(name2.exists()))
		{
			name2.createNewFile();
		}
		Kaobei.kaobei(name2, name1);
	}
}
