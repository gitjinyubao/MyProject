package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindBigNumber {
	
	public static void main(String[] args) {
		// ����¼�����ݵĶ���
		Scanner sc = new Scanner(System.in);
		
		// ��0����������¼�룬���ǲ�֪�����ٸ�������list�洢
		List<Integer> list = new ArrayList<Integer>();
		
		while(true) {
			System.out.println("���������֣�");
			int number = sc.nextInt();
			if (number != 0) {
				list.add(number);
			} else {
				break;
			}
		}
		
		/*
		 * ����ת��Ϊ����
		 * 1. Object[] toArray()
		 * 2. T T[] toArray[T[] a]
		 * T��������������
		 */
		Integer[] i = list.toArray(new Integer[list.size()]);
		
		// ����������(��Ȼ����)
		Arrays.sort(i);
		
		// ��ȡ������������ֵ���
		System.out.println(i[i.length - 1]);
	}
}
