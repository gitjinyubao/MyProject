public class Shu
{
	public static void main(String[] args)
	{   double sum=0;
		for(int i=1;i<50;++i)
		{
			
			sum+=(2.0*i-1)/(2*i+1);
		}
		System.out.println("The sum is"+sum);
	}
}