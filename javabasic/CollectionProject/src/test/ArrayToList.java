package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * ��Ȼ���Խ�����ת��Ϊ���ϣ����Ǳ��ʻ������飬list�������ӻ�ɾ���ı䳤�ȣ�ֻ�ܶ�ת��������
 * ����ʵ���޸Ĳ���
 * Arrays.asList(T...t);�ɱ����
 */
public class ArrayToList {
	
	public static void main(String[] args) {
		String[] array  = {"a", "b","b","b","c"};
		
		List<String> list = Arrays.asList(array);
		
		// ȥ���ظ�Ԫ��
		Set<String> s = new HashSet<String>(list);
		
		List<String> listOne = new ArrayList<String>(s); 
		
		for (String a : listOne) {
			System.out.println(a);
		}
		
		System.out.println("===========================");
		
		List<String> lt = Arrays.asList();
		
		for (String a : lt) {
			System.out.println(a);
		}
		
		System.out.println("===========================");
		
		List<String> lts = Arrays.asList("hello", "word");
		
		for (String a : lts) {
			System.out.println(a);
		}
	}
}
