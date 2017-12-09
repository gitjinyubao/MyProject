import java.util.Scanner;
public class B
{
    public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
	    System.out.println("Enter two line:");
		String s=input.nextLine();
        String s1=input.nextLine();	
		String s2=input.nextLine();
		 for(int i=3;i<12;i++)
		{
			
			for(int j=1;j<i-1;j++)
			{
				
				System.out.print(" ");
				System.out.print("   ");
			}
	        for(int k=1;k<=12-i;k++)
		    { 
			    System.out.print(s);
				System.out.print("   ");
		    } 
		    System.out.println("");
		}
		for(int i=0;i<10;i++)
			{
				for(int j=0;j<10-i;j++)
				{
					System.out.print(" ");
					System.out.print("   ");
				}
				for(int j=0;j<i;j++)
				{
					System.out.print(s1);
					System.out.print("   ");
				}
				for(int j=i-2;j>=0;j--)
				{
					System.out.print(s1);
					System.out.print("   ");
				}
				System.out.println("");
			}
			 for(int i=3;i<12;i++)
		{
			
			for(int j=1;j<i-1;j++)
			{
				
				System.out.print(" ");
				System.out.print("   ");
			}
	        for(int k=1;k<=12-i;k++)
		    { 
			    System.out.print(s2);
				System.out.print("   ");
		    } 
		    System.out.println("");
		}
		 
		
	}

}







