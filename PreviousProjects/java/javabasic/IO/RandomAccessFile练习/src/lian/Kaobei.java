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
		String s="�й�";
		byte[] b=s.getBytes("gbk");
		f1.write(b);//��b������д��	
		f1.seek(0);
        int y;
        byte [] b2=new byte[(int)f1.length()];
        f1.read(b2);//����b2��
        /**
         * ����
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
			f.mkdirs();//����Ŀ¼
		}
		File name1=new File(f,"a.txt");
		if(!(name1.exists()))
		{
			name1.createNewFile();//�����ı�
		}
		File name2=new File(f,"a1.txt");
		if(!(name2.exists()))
		{
			name2.createNewFile();
		}
		Kaobei.kaobei(name2, name1);
	}
}
