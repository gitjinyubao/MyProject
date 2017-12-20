package test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 1. ��������������
 *              �����Ʊ�ʾ������ʹ�ô���������ױ���⣬�﷨�ǳ��򵥣�ֻҪ�ڶ�������ֵǰ���Ob��OB
 * 2. ����������������Գ����»��ߣ�
 *                          ��ǿ�˶���ֵ���Ķ��ԣ������ݷָ�
 * 3. ���ͼ�
 * 4. �쳣�Ķ��catch�ϲ� Day19
 * 5. try-with-resources
 *                      try(������java.lang.AutoCloseable���������){...}
 *    �ô���
 *        ��Դ�Զ��ͷţ�����Ҫclose()
 *        ����Ҫ�ر���Դ�Ĳ��ֶ������������ok
 *        ��Ҫ������ϵ�Ķ���������ӿڵ�����
 */

public class Test {
	
	public static void main(String[] args) {
		// ������������
		// int x = OB0101011;
		// ����������������Գ����»���
		int y = 11_2_3;
		System.out.println(y);
		// ���ͼ�
		ArrayList<String> list = new ArrayList<>();
 		// try-with-resources
		try {
			FileReader fr = new FileReader("a.txt");
			FileWriter fw = new FileWriter("b.txt");
			
			int ch = 0;
			while ((ch = fr.read()) != -1) {
				fw.write(ch);
			}
			fw.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// �Ľ��汾
		try (FileReader fr = new FileReader("a.txt");
				FileWriter fw = new FileWriter("b.txt");) {			
			int ch = 0;
			while ((ch = fr.read()) != -1) {
				fw.write(ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
