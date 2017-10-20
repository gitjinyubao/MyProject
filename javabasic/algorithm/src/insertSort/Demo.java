package insertSort;

public class Demo {
	
	public static void main(String[] args) {
		int [] list = {1, 9, 2, 7, 3, 8, 6, 10, 5};
		
		for (int i = 1; i < list.length; ++i) {
			int currentElement = list[i];
			
			int k;
			
			for (k = i - 1; k >= 0 && list[k] > currentElement; k-- ) {
				list[k + 1] = list[k];
			}
			
			list[k + 1] = currentElement;
		}
		
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
}
