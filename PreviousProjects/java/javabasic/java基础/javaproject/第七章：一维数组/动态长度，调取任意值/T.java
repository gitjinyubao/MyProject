import java.util.Scanner;
public class T
{
	public static void main(String[] args)
	{
		int a;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number to stand for the leength of the arrar");
		a=input.nextInt();
		double[] s=new double[a];
		for(int i=1;i<a;++i)
		{
			s[i]=input.nextDouble();
		}
		for(double e:s)
		{
			System.out.println(e);
		}
		
	}
}