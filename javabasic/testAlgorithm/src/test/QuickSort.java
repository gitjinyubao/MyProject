package test;

/*
 * 快速排序使用分治法策略来把一个序列分为两个子序列
 * 从数列中挑出一个元素，称为“基准”.
 * 重新排序数列，所有元素比基准值小的摆放在基准前面，所有元素比基准值大的摆在基准的后面（相同的数可以到任一边）。在这个分割之后，  
 * 该基准是它的最后位置。这个称为分割（partition）操作。  
 * 递归地把小于基准值元素的子数列和大于基准值元素的子数列排序。  
 */
public class QuickSort {

	public static void quickSort(int[] numbers, int start, int end) {   
	    if (start < end) {   
	        int base = numbers[start]; // 选定的基准值（第一个数值作为基准值）   
	        int temp; // 记录临时中间值   
	        int i = start, j = end;   
	        do {   
	            while ((numbers[i] < base) && (i < end))   
	                i++;   
	            while ((numbers[j] > base) && (j > start))   
	                j--;   
	            if (i <= j) {   
	                temp = numbers[i];   
	                numbers[i] = numbers[j];   
	                numbers[j] = temp;   
	                i++;   
	                j--;   
	            }   
	        } while (i <= j);   
	        if (start < j)   
	            quickSort(numbers, start, j);   
	        if (end > i)   
	            quickSort(numbers, i, end);   
	    }
	}
	
	public static void main(String[] args) {
		int[] a  = {10, 27, 3};
		quickSort(a, 0, a.length - 1);
		
		for(int iterm : a) {
			System.out.println(iterm);
		}
	}
}
