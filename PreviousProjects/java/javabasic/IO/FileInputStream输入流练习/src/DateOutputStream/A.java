package DateOutputStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A {
     /**
      * DataInputStream&DataOutputStream是对方法的封装类：eg;writeInt();
      * @param args
     * @throws IOException 
      */
	public static void D(File name1) throws IOException
	{
		/**
		 * 写入文本
		 */
		DataInputStream d1=new DataInputStream(new FileInputStream(name1));
		DataOutputStream d2=new DataOutputStream(new FileOutputStream(name1));
        d2.writeInt(13);
		d2.writeInt(14);
		d2.writeInt(179);
		d2.writeUTF("中国梦");
		d2.writeUTF("圆梦");
		d2.writeChars("我");
		
		/**
		 * 读出来
		 */
		int i;
		i=d1.readInt();
		System.out.println(i);
		i=d1.readInt();
		System.out.println(i);
		i=d1.readInt();
		System.out.println();
		String s;
		s=d1.readUTF();
		System.out.println(s);
		s=d1.readUTF();
		System.out.println(s);
	
		d1.close();
		d2.close();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File name1=new File("D:\\jyb1.txt");
//		if(!(name1.exists()))
//		{
//			name1.createNewFile();
//		}
		A.D(name1);
	}
}
