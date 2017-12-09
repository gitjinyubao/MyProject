import java.util.Scanner;
public class Mi
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number1:");
		double  randomize=input.nextDouble();
		System.out.println("Enter a number2:");
		double  random=input.nextDouble();
		double a=(Math.pow(randomize,random));
		System.out.println(random+"of the"+randomize+"party is"+a);
		
	}
}