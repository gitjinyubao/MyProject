import java.util.Scanner;
public class A 
{
    public static void main(String[] args)
	{
	     Scanner input=new Scanner(System.in);
		 System.out.println("Enter the length :");
		 int a=input.nextInt();
		 double[] s=new double[a]; 
		 for(int i=0;i<a;++i)
		 {
			 s[i]=Math.random() *100;
		 }
		 for(double e:s)
	     {
			System.out.println(e);
		 }
		 System.out.println("----------");
		 for(int i=a-1;i>=0;++i)
		 {
			 if(i==0)
			 {
				 int j;
				 j=(int)(1+Math.random() *a);
				 double m;
				 m=s[j];
				 s[i]=s[j];
			 }
			 else
			 {
				 int j;
				 double m;
				 j=(int)(Math.random() *a);
				 m=s[j];
				 s[i]=s[j];
			 }
			    for(double e:s)
	        {
			    System.out.println(e);
		    }
		 }
	}
}