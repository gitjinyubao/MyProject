package selectSort;

public class Demo {
	
	public static void selectSort(int[] array)
	  {
		  int arrayLength = array.length;
		 for (int i = 0; i < arrayLength-1; i++)
		{
			 //mix用来保存数组中最小元素的索引值
			int mix = i; //选择当前的数组元素作为最小值，遍历到最后，找到最小的数组元素的索引，和当前位置交换
			for (int j = i+1; j < arrayLength; j++)
			{
				if(array[j] < array[mix])
				{
					mix = j;
				}
			}
			//每趟最多交换一次
			if(mix != i) //如果mix不等于当前的i,让最小值的和当前位置的值交换
			{
				swap(array,mix,i);
			}
				
		}
	  }
	
	  private static void swap(int[] array,int mix,int i)
	  {
		  int temp = array[mix];
		  array[mix] = array[i];
		  array[i] = temp;
	  }
	  
	  public static void main(String[] args) {
		  int [] list = {1, 9, 2, 7, 3, 8, 6, 10, 5};
		  selectSort(list);
		  
		  for (int i = 0; i < list.length; i++) {
				System.out.println(list[i]);
		  }
	}
}
