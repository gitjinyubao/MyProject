package decorateDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/*
 * װ��ģʽ��
 *        ʹ�ñ�װ�����һ�������ʵ�����ڿͻ��˽����ʵ������װ���࣬�Ǽ̳е��������
 *        ʹ��װ��ģʽ��������̳�����չ���ܵķ�ʽ����������̬��ӹ��ܣ������������
 *        ������ϣ���������߼�����
 */
public class Test {

	public static void main(String[] args) {
		IPhone p = new Phone();
		
		DecoratePhone mudOne = new MusicDecorate(p);
		
		mudOne.call();
			
		DecoratePhone mudTwo = new PlayerDecorate(p);
		
		mudTwo.call();
		
		// װ��ģʽ�����һ��ʹ��
		DecoratePhone mudThree = new PlayerDecorate(new MusicDecorate(p));
		
		mudThree.call();
		
		// װ��ģʽӦ����IO����������
		// �ֽ���װ�γ�һ���ַ������ַ���װ�γɸ�Ч���ַ���
		// System.in ����ֵ��inputStream
		/* InputStream is = System.in;
		 * InputStreamReader isr = new InputStreamReader(is);
		 * BufferedReader br = new BufferedReader(isr);
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // ������
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // д����
		Scanner ac = new Scanner(System.in);
	}
}
