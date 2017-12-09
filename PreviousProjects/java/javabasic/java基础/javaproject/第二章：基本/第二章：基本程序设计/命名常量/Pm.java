import java.util.Scanner;
public class Pm
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter the radius:");
		double radius=input.nextDouble();
		final double Mn=3.14159;
		double area=Mn*radius*radius;
		double c=area*Mn;
		System.out.println("The area is"+area);
		System.out.println("The c is"+c);
	}
}
