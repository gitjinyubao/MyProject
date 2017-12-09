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
		System.out.println("max(1,2)"+max(1,2));
		System.out.println("max(15.5,2)"+max(15.5,2));
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
	public static int max(int m,int n)
	{
	    System.out.println("diao yong");
		int t;
		if(m>=n)
		{
			t=m;
		}
		else
			t=n;
		return t;
	}
	public static int  max(double m,int n)
	{
	    System.out.println("diao yong two");
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
	


