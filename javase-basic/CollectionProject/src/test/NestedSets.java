package test;

import java.sql.Array;
import java.util.ArrayList;

public class NestedSets {
	
	public static void main(String[] args) {
		// �����󼯺�
		ArrayList<ArrayList<String>> bigArray = new ArrayList<ArrayList<String>>();
		
		// ��������һ
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("a");
		list1.add("b");
		list1.add("c");
		
		bigArray.add(list1);
		
		// ��������һ
		ArrayList<String> list2 = new ArrayList<String>();
		
		list1.add("aa");
		list1.add("bb");
		list1.add("cc");
		
		bigArray.add(list2);
		
		// Ƕ�ױ���
		for(ArrayList<String> als : bigArray) {
			for(String s : als) {
				System.out.println(s);
			}
		}
	}
}
