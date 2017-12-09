import java.util.Scanner;
public class A 
{
    public static void main(String[] args)
	{
	     Scanner input=new Scanner(System.in);
		 System.out.println("Enter a ch:");
		 char ch=input.nextChar();
		 if(ch>='A'&&ch<='Z')
		 {
			 System.out.println(ch+"is an uppercase letter");
		 }
		 if(ch>='a'&&ch<='z')
		 {
			 System.out.println(ch+"is a lowercase letter");
		 }
		 if(ch>='0'&&ch<='9')
		 {
			 System.out.println(ch+"is a numeric character");
		 }
	}

}

