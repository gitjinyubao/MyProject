package lian;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class A {
	/**
	 * 利用RandomAccessFile访问文件
	 * @param name
	 * @throws IOException
	 */
	public static void c(File name) throws IOException
	{
		RandomAccessFile r=new RandomAccessFile(name,"rw");
		/**
		 * 文件内容写入
		 */
		r.write('1');
		r.write('A');
		r.write('B');
		int i=12;
//		r.write(i>>>24);
//		r.write(i>>>16);
//		r.write(i>>>8);
//		r.write(i);
		String s="中国";//字符串需要用字节数组装入，将字符串以字节数组的形式输入
		byte []b=s.getBytes("gbk");//表明（输入字符串）文本格式
		r.write(b);
		System.out.println(r.getFilePointer());
		System.out.println(r.length());
		System.out.println("");
		/**
		 * 读取文件内容
		 */
		r.seek(0);//（RandomAccessFile）读文件之前要确定指针的位置
		int d;
		while((d=(r.read()))!=-1)
		{
			System.out.print(d);
		}
		System.out.println("");
		
		/**
		 * 一次性读取
		 */
		System.out.println("数组形式");
		r.seek(8);
		byte[] b1=new byte[(int)r.length()];//确定字节数组长度刚好为文件的大小
		r.read(b1);//批量读取
		System.out.print(Arrays.toString(b1));//以数组的形式输出
		System.out.println("");
		
		/**
		 * 一次性读取
		 */
		System.out.println("16进制");
		for(byte d1:b1)
		{
			System.out.print(Integer.toHexString((d1&0xff))+"  ");
		}
		
		
		
		
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File name=new File("D:\\金宝\\jin.txt");
		if(!(name.exists()))
		{
			name.createNewFile();
		}
		A.c(name);

	}

}
