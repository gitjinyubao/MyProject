import java.util.Scanner;
public class A 
{
    public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=max(a,b);
		System.out.println("The max is"+c);
	}
	public static double max(double m,double n)
	{
		double t;
		if(m>=n)
		{
			t=m;
		}
		else
			t=n;
		return t;
	}
	
}
	


