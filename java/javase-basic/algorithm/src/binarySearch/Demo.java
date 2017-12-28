package binarySearch;
/*
 * ¶ş·Ö²éÕÒ
 */
public class Demo {
	
	 public static int binarySearch(int[] arr, int x) {
		 int low = 0;   
         int high = arr.length-1;   
         while(low <= high) {   
             int middle = (low + high)/2;   
             if(x == arr[middle]) {   
                 return middle;   
             }else if(x <arr[middle]) {   
                 high = middle - 1;   
             }else {   
                 low = middle + 1;   
             }  
         }  
         return -1;  
	 }
	 
	 public static void main(String[] args) {
		 int [] list = {1, 9, 2, 7, 3, 8, 6, 10, 5};
		 int index = binarySearch(list, 6);
	     System.out.println(index);
	}
}