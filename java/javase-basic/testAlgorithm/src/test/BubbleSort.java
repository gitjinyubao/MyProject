package test;

/** 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 *对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
 * 针对所有的元素重复以上的步骤，除了最后一个。
 * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 *   
 */  
public class BubbleSort {
	
	public static void main(String[] args) {
		int[] a  = {1, 2, 3, 4, 8, 5, 7, 6};
		
		for (int i= 1; i < a.length; ++i) {
			for (int j = 0; j < a.length - i; ++j) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		for (int iterm : a) {
			System.out.println(iterm);
		}
	}
}
