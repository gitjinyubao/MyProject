package lian;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class A {
	/**
	 * ����RandomAccessFile�����ļ�
	 * @param name
	 * @throws IOException
	 */
	public static void c(File name) throws IOException
	{
		RandomAccessFile r=new RandomAccessFile(name,"rw");
		/**
		 * �ļ�����д��
		 */
		r.write('1');
		r.write('A');
		r.write('B');
		int i=12;
//		r.write(i>>>24);
//		r.write(i>>>16);
//		r.write(i>>>8);
//		r.write(i);
		String s="�й�";//�ַ�����Ҫ���ֽ�����װ�룬���ַ������ֽ��������ʽ����
		byte []b=s.getBytes("gbk");//�����������ַ������ı���ʽ
		r.write(b);
		System.out.println(r.getFilePointer());
		System.out.println(r.length());
		System.out.println("");
		/**
		 * ��ȡ�ļ�����
		 */
		r.seek(0);//��RandomAccessFile�����ļ�֮ǰҪȷ��ָ���λ��
		int d;
		while((d=(r.read()))!=-1)
		{
			System.out.print(d);
		}
		System.out.println("");
		
		/**
		 * һ���Զ�ȡ
		 */
		System.out.println("������ʽ");
		r.seek(8);
		byte[] b1=new byte[(int)r.length()];//ȷ���ֽ����鳤�ȸպ�Ϊ�ļ��Ĵ�С
		r.read(b1);//������ȡ
		System.out.print(Arrays.toString(b1));//���������ʽ���
		System.out.println("");
		
		/**
		 * һ���Զ�ȡ
		 */
		System.out.println("16����");
		for(byte d1:b1)
		{
			System.out.print(Integer.toHexString((d1&0xff))+"  ");
		}
		
		
		
		
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File name=new File("D:\\��\\jin.txt");
		if(!(name.exists()))
		{
			name.createNewFile();
		}
		A.c(name);

	}

}
