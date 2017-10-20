package test;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 * ���󣺻�ȡ�ַ�����ÿ����ĸ���ֵĴ����ͽ��
 */
public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		// �Ӽ���¼��һ���ַ���
		Scanner sc = new Scanner(System.in);
	    System.out.println("�����ַ�����");
	    String s = sc.nextLine();
	    
	    // ����һ��TreeMap����
	    TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
	    
	    // ���ַ���ת��Ϊ����
	    char[] array = s.toCharArray();
	    
	    // �������鲢�Ұ��ַ��ͳ��ֵĴ�������map��
	    for (char cc : array) {
	    	Integer i = tm.get(cc);
	    	
	    	if (i == null) {
	    		tm.put(cc, 1);
	    	} else {
	    		i++;
	    		tm.put(cc, i);
	    	}
	    }
	    
	    // �����ַ�����������
	    StringBuilder sb = new StringBuilder();
	    
	    // Characterʵ����Compareable�ӿڣ�ʵ����������ĸ
	     
	    // �õ����������map����
	    Set<Character> skey = tm.keySet();
	    for (Character sk : skey) {
	    	sb.append(sk).append("(").append(tm.get(sk)).append(")");
	    }
	    
	    // ��ӡ���
	    System.out.println(sb);
	}
}
