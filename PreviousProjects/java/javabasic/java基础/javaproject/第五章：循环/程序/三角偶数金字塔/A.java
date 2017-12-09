import java.util.Scanner;
public class A
{
	public static void main(String[] args)
	{
			Scanner input=new Scanner(System.in);
			System.out.println("Enter a number:");
			double n=input.nextDouble();
			for(int i=0;i<n+1;i++)
			{
				for(int j=0;j<n-i;j++)
				{
					System.out.print(" ");
					System.out.print("   ");
				}
				for(int j=0;j<i;j++)
				{
					System.out.print((int)Math.pow(2, j));
					System.out.print("   ");
				}
				for(int j=i-2;j>=0;j--)
				{
					System.out.print((int)Math.pow(2, j));
					System.out.print("   ");
				}
				System.out.println("");
			}
		}
	
}



