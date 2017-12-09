import java.util.Scanner;
public class San
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a number to indicate the number of layers in Pyramid:");
		int n=input.nextInt();
		for(int i=1;i<=n;++i)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;++j)
			{
				System.out.print(j);
				System.out.print("");
			}
			if(i>=2)
			{
				for(int m=i;m-1>=1;--m)
				{
					System.out.print((m-1));
					System.out.print("");
				}
			}
			System.out.println();
		}
	}
}