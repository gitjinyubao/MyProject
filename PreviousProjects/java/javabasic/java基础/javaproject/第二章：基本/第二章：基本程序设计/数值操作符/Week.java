import java.util.Scanner;
public class Week
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number of the week:");
	    double  number=input.nextDouble();
		double t=number%7;
		if(t==2) 
		{
			System.out.println("The day is the Tuesday");
		}
		else
		{
			System.out.println("The day is not the Tuesday");
		}
	}
}