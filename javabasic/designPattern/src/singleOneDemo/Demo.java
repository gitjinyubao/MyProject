package singleOneDemo;

import java.io.IOException;

/*
 * ����ģʽ��ʹ���ڴ���ֻ��һ������
 *         ����ʽ��
 *              ��һ���ؾʹ�������
 *              �ǲ��������ĵ���ģʽ
 *         ����ʽ��
 *              �õ�ʱ��Ż�ȥ��������
 *              ���ܻ������ĵ���ģʽ
 *                 A:�����أ��ӳټ��أ�
 *                 B:�̰߳�ȫ����
 *                 		a:�Ƿ���̻߳���
 *                      b:�Ƿ�������
 *                      c:�Ƿ��ж�����乲ͬ�����͹�������     
 *  ÿ��javaӦ�ó�����һ��Runtime��ʵ����ʹӦ�ó����ܹ��������еĻ���������      
 */
public class Demo {
	public static void main(String[] args) throws IOException {
		HungryMan hm1 = HungryMan.getHungryMan();
		HungryMan hm2 = HungryMan.getHungryMan();
		System.out.println(hm1==hm2);
		System.out.println("==================================");
		LazyMan  lm1 = LazyMan.getLazyMan();
		LazyMan  lm2 = LazyMan.getLazyMan();
		System.out.println(lm1==lm2);
		System.out.println("==================================");
		
		// RuntimeҲ�ǵ���ģʽ
		Runtime rt = Runtime.getRuntime();
		// �������򣨵���DOS���
		  // �򿪼��±�
		// rt.exec("notepad");
		  // �򿪼�����
		// rt.exec("calc");
          // �رռ����
		// rt.exec("shutdown -s -t 10000");
		  //ȡ���رռ����
		 rt.exec("shutdown -a");
	}
}
