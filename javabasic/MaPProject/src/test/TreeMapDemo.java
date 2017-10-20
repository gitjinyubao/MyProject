package test;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 * 需求：获取字符串中每个字母出现的次数和结果
 */
public class TreeMapDemo {
	
	public static void main(String[] args) {
		
		// 从键盘录入一个字符串
		Scanner sc = new Scanner(System.in);
	    System.out.println("输入字符串：");
	    String s = sc.nextLine();
	    
	    // 定义一个TreeMap集合
	    TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
	    
	    // 把字符串转化为数组
	    char[] array = s.toCharArray();
	    
	    // 遍历数组并且把字符和出现的次数放入map中
	    for (char cc : array) {
	    	Integer i = tm.get(cc);
	    	
	    	if (i == null) {
	    		tm.put(cc, 1);
	    	} else {
	    		i++;
	    		tm.put(cc, i);
	    	}
	    }
	    
	    // 定义字符缓冲区变量
	    StringBuilder sb = new StringBuilder();
	    
	    // Character实现了Compareable接口，实现了排序字母
	     
	    // 得到结果：遍历map集合
	    Set<Character> skey = tm.keySet();
	    for (Character sk : skey) {
	    	sb.append(sk).append("(").append(tm.get(sk)).append(")");
	    }
	    
	    // 打印结果
	    System.out.println(sb);
	}
}
