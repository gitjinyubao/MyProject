package selectSort;

public class Demo {
	
	public static void selectSort(int[] array)
	  {
		  int arrayLength = array.length;
		 for (int i = 0; i < arrayLength-1; i++)
		{
			 //mix����������������СԪ�ص�����ֵ
			int mix = i; //ѡ��ǰ������Ԫ����Ϊ��Сֵ������������ҵ���С������Ԫ�ص��������͵�ǰλ�ý���
			for (int j = i+1; j < arrayLength; j++)
			{
				if(array[j] < array[mix])
				{
					mix = j;
				}
			}
			//ÿ����ཻ��һ��
			if(mix != i) //���mix�����ڵ�ǰ��i,����Сֵ�ĺ͵�ǰλ�õ�ֵ����
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
