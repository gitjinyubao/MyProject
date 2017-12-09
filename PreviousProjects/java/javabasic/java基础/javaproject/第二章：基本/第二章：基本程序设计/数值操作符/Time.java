import java.util.Scanner;
public class Time
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter an integer for seconds:");
		int seconds=input.nextInt();
		int minutes=seconds/60;
		int c=seconds%60;
		System.out.println(seconds+"seconds is"+minutes+"minutes and"+c+"seconds");		
	}
}