package YuJu;
import java.util.Scanner;
public class BuChong 
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter two numbers");
	    int a=input.nextInt();
	    int b=input.nextInt();
	    int c=a+b;
	    System.out.println(a+"+"+b+"="+"?");
	    System.out.println("Enter the c");
	    c=input.nextInt();
	    System.out.println(a+"+"+b+"="+c+" "+"is"+" "+(a+b==c));
		
	}//��a+b==c)����һ��booleanֵ��booleanֵ��������һ����false,һ����true��;
}
