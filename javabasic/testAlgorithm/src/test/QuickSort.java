package test;

/*
 * ��������ʹ�÷��η���������һ�����з�Ϊ����������
 * ������������һ��Ԫ�أ���Ϊ����׼��.
 * �����������У�����Ԫ�رȻ�׼ֵС�İڷ��ڻ�׼ǰ�棬����Ԫ�رȻ�׼ֵ��İ��ڻ�׼�ĺ��棨��ͬ�������Ե���һ�ߣ���������ָ�֮��  
 * �û�׼���������λ�á������Ϊ�ָpartition��������  
 * �ݹ�ذ�С�ڻ�׼ֵԪ�ص������кʹ��ڻ�׼ֵԪ�ص�����������  
 */
public class QuickSort {

	public static void quickSort(int[] numbers, int start, int end) {   
	    if (start < end) {   
	        int base = numbers[start]; // ѡ���Ļ�׼ֵ����һ����ֵ��Ϊ��׼ֵ��   
	        int temp; // ��¼��ʱ�м�ֵ   
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
