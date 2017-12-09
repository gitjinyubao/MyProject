import java.util.Scanner;
import java.util.Scanner;
public class A
{
	public static void main(String[] args)
	{
		double perimeter;
		System.out.println("Enter three numbers:");
		Scanner input=new Scanner(System.in);
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		if((a+b)>c||(a+c)>b||(b+c)>a)
		{
			perimeter=a+c+b;
			System.out.println("The perimeter of the triangle is:"+perimeter);			
		}
		else
		{
			System.out.println("The value you entered is error");
		}
	}

}


