package test;

/** �Ƚ����ڵ�Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������
 *��ÿһ������Ԫ����ͬ���Ĺ������ӿ�ʼ��һ�Ե���β�����һ�ԡ�����һ�㣬����Ԫ��Ӧ�û�����������
 * ������е�Ԫ���ظ����ϵĲ��裬�������һ����
 * ����ÿ�ζ�Խ��Խ�ٵ�Ԫ���ظ�����Ĳ��裬ֱ��û���κ�һ��������Ҫ�Ƚϡ�
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
