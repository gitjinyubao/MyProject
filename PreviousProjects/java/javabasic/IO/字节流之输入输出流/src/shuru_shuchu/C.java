package shuru_shuchu;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		String nam="D:/jinyu.txt";
		File name=new File(nam);
		DataOutputStream d1=new DataOutputStream(new FileOutputStream(name));
		/**
		 * ��װ������
		 */
		d1.writeInt(1);
		d1.writeInt(3);
		d1.writeInt(14);
		d1.writeInt(520);
		d1.writeChars("�й�");//16����д��(java���ַ�������)
		d1.writeUTF("��������");//8����д��
		System.out.println(name.length());
		
		
		/**
		 * ��������ȡ�ļ�����
		 */
		FileInputStream f1=new FileInputStream(name);
		byte[] b=new byte[2000*1024];
		int c;
		while((c=f1.read(b, 0, b.length))!=-1)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print((f1.read(b, 0, c))&0xff);
			}
			if(c%10==0)
			{
				System.out.println();
			}
		}
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
	   
	   f1.close();
	   d1.close();
	   d2.close();
	}
	}


