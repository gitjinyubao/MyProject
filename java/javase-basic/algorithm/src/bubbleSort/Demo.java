package bubbleSort;

public class Demo {
	public static void main(String[] args) {
		int [] list = {1, 9, 2, 7, 3, 8, 6, 10, 5}; 
		
		for (int i = 1; i < list.length ; ++i) {
			for (int j = 0; j < list.length - i; ++j) {
				if (list[j] > list[j + 1]) {
					int a = list[j];
					list[j] = list[j + 1];
					list[j + 1] = a;
				}
			}
		}
		
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
}
