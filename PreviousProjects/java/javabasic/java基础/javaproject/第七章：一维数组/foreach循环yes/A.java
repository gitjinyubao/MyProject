import java.util.Scanner;
public class A 
{
    public static void main(String[] args)
	{
		 int a;
		 Scanner input=new Scanner(System.in);
		 System.out.println("Enter a number to stand for the leength of the arrar");
		 a=input.nextInt();
		 double []s=new double[a];
		 for(int i=1;i<a;i++)
		 {
			 s[i]=2*i+s[i-1];
		 }
		 s[0]=s[2]+s[3];
		 for(double e:s)
		 {
			 System.out.println(e);
		 }
		 System.out.println(s.length);
	}

}

