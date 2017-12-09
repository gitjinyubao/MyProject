import java.util.Scanner;
public class Age
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("enter three numbers:");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		double average=(a+b+c)/3.0;
		System.out.println("The average of"+a+b+c+'\n'+"is"+'\n'+average);
	}
}