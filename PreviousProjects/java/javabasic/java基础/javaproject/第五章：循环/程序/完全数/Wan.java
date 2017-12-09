public class Wan
{
	public static void main(String[] args)
	{   

		int a;
		for(int i=1;i<10000;i++)
		{   
	        int sum=0;
			for(int j=1;j<i;j++)
			{   
				a=i%j;
				if(a==0)
				{
					sum+=j;
				}
			}
			if(i==sum)
				{
					System.out.println(i);
				}
		}
	}
}