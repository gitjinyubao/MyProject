package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindBigNumber {
	
	public static void main(String[] args) {
		// 创建录入数据的对象
		Scanner sc = new Scanner(System.in);
		
		// 以0结束，键盘录入，我们不知道都少个，就用list存储
		List<Integer> list = new ArrayList<Integer>();
		
		while(true) {
			System.out.println("请输入数字：");
			int number = sc.nextInt();
			if (number != 0) {
				list.add(number);
			} else {
				break;
			}
		}
		
		/*
		 * 集合转化为数组
		 * 1. Object[] toArray()
		 * 2. T T[] toArray[T[] a]
		 * T必须是引用类型
		 */
		Integer[] i = list.toArray(new Integer[list.size()]);
		
		// 对数组排序(自然排序)
		Arrays.sort(i);
		
		// 获取数组的最大索引值输出
		System.out.println(i[i.length - 1]);
	}
}
