package shuru_shuchu;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class A {
	public static void Jian(File name) throws IOException
	{
		DataOutputStream d1=new DataOutputStream(new FileOutputStream(name));
		/**
		 * ��װ������
		 */
		d1.writeInt(1);
		d1.writeInt(3);
		d1.writeInt(14);
		d1.writeInt(520);
		d1.writeUTF("��������");//8����д��
		d1.writeChars("�й�");//16����д��(java���ַ�������)
		System.out.println(name.length());
		/**
		 * ���������ݰ��������ģ�����
		 */
		DataInputStream d2=new DataInputStream(new FileInputStream(name));
		int i;
	   i=d2.readInt();
	   System.out.println(i);
	   i=d2.readInt();
	   System.out.println(i);
	   i=d2.readInt();
	   System.out.println(i);
	   i=d2.readInt();
	   System.out.println(i);
	   String s;
	   s=d2.readUTF();
	   System.out.println(s);   
	   /**
		 * ��������ȡ�ļ�����
		 */
	   
	    FileInputStream f1=new FileInputStream(name);
		byte [] b=new byte[2000*1024];
		int b7;
		while((b7=f1.read(b, 0, b.length))!=-1)
		{
			for(int j=0;j<b7;++j)
			{
				if(b[j]<0xff)
				{
					System.out.print("0");
				}
				System.out.print(Integer.toHexString(b[j]&0xff)+"  ");
				if(j%10==0)
				{
					System.out.println();
				}
			}		
		}
       f1.close();
	   d1.close();
	   d2.close();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		String name="D:\\jinyuhus\\a.dat";
		File name=new File("D:\\jinyubao.txt");
		if(!(name.exists()))
		{
			name.createNewFile();
			
		}
		/**
		 * ע��:.createNewFile():�����ı�
		 *     .mkdir()����Ŀ¼
		 */    
//		File f2=new File(f1,"a.dat");
//		if(!(f2.exists()))
//		{
//			f2.mkdirs();
//		}
        A.Jian(name);
	}
}
