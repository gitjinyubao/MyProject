import java.util.Scanner;
public class A 
{
    public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=input.nextInt();
	    int b=input.nextInt();
		int t;
        t=gcd(a,b);
        System.out.println("The two numbers common divisor is"+t);
        System.out.println("The two numbers common divisor is"+gcd(34,82));	
	}
	public static int gcd(int m,int n)
	{
		int gcd=1;
		for(int k=2;k<=m&&k<=n;k++)
		{
			if(m%k==0&&n%k==0)
			{
				gcd=k;
			}
		}
		return gcd;
	}
}
