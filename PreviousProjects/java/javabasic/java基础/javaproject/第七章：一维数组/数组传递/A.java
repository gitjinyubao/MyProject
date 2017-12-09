import java.util.Scanner;
public class A 
{
    public static void main(String[] args)
	{
		 Scanner input=new Scanner(System.in);
		 System.out.println("Enter the length:");
		 int a=input.nextInt();
		 double[] s=new double[a];
		 for(int i=0;i<a;++i)
		 {
			 s[i]=input.nextDouble();
		 }
		 double  x=1;
		 m(x,s);
		 System.out.println("x is"+x);
		 System.out.println("s[2] is"+s[2]);
	}
	public static void m( double b,double[] p)
	{
		b=2;
		p[2]=6;
	}
}

