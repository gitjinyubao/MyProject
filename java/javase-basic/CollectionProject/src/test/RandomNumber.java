package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * ��ȡ10��1-20֮�����������Ҳ��ظ�
 * ������ʵ�֣���������ĳ����ǹ̶���
 */
public class RandomNumber {
	
	public static void main(String[] args) {
		// ��ȡ���������
		Random rd = new Random();
		
		// ׼��һ�����ϣ� ʹ������ĺô�:����Ԥ�����ȣ����ĳ����ǿɱ��
		List<Integer> list = new ArrayList<Integer>();
		
		// ��������������ұ�������
		int count = 0;
		while(count < 10) {
			int a = rd.nextInt(20) + 1;
			
			if (!list.contains(a)) {
				list.add(a);
			}
		}
 	}
}
