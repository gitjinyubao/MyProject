package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Demo {
	
	public static void main(String[] args) {
		String a = "adshhhhhhhhhhhhhjjjjjbbbbkkkkkkkkkkkkkkkkkllllljjjjjffffffbbbb";
		System.out.println(getMaxChar(a.toCharArray())); 
	}
	
	public static String getMaxChar(char[] c) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		
		for (int i = 0; i < c.length; ++i) {
			int number = 0;
			for (int j = 0; j < c.length; ++j) {
				if (c[i] == c[j]) {
					number++;
				}
			}
			m.put(number, Character.toString(c[i]));
		}
		
		int numbersLength = 0;
		int index = 0;
		
		for (@SuppressWarnings("unused") Entry<Integer, String> e : m.entrySet()) {
			numbersLength++;
		}
		
		int[] numbers = new int[numbersLength];
		
		for (Entry<Integer, String> e : m.entrySet()) {
			numbers[index] = e.getKey();
			++index;
		}
		
		for (int i = 1; i < numbersLength; ++i) {
			for (int j = 0; j < numbersLength - i; ++j) {
				if (numbers[j] > numbers[j+1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		
		return m.get(numbers[numbersLength - 1]);
	}
}
