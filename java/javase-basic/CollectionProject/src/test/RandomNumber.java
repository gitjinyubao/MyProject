package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * 获取10个1-20之间的随机数，且不重复
 * 用数组实现，但是数组的长度是固定的
 */
public class RandomNumber {
	
	public static void main(String[] args) {
		// 获取随机数对象
		Random rd = new Random();
		
		// 准备一个集合： 使用数组的好处:不用预定长度，他的长度是可变的
		List<Integer> list = new ArrayList<Integer>();
		
		// 产生随机数，并且保存起来
		int count = 0;
		while(count < 10) {
			int a = rd.nextInt(20) + 1;
			
			if (!list.contains(a)) {
				list.add(a);
			}
		}
 	}
}
