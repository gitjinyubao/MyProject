import java.util.Scanner;
public class A 
{
    public static void main(String[] args)
	{
		 int i;
	     Scanner input=new Scanner(System.in);
		 System.out.println("Enter the length :");
		 int a=input.nextInt();
		 double[] s=new double[a]; 
		 for( i=0;i<a;++i)
		 {
			 s[i]=Math.random() *100;
		 }
		 for(double e:s)
	     {
			System.out.println(e);
		 }
		 System.out.println("----------");
		 for( i=a-1;i>0;--i)
		 {
			 int j=(int)(Math.random() *(i+1));
			  System.out.println(s[i]);
			  System.out.println(s[j]);
			  System.out.println("----------");
			  double t=s[i];
			  s[i]=s[j];
			  s[j]=t;
			  System.out.println(s[i]);
			  System.out.println(s[j]);
			  System.out.println("----------");
		 }	  
		 double[] s1=new double[5];
		 for( i=0;i<5;i++)
		 {
			 s1[i]=Math.random() *10;
		 }
		 for(double e:s1)
		 {
			System.out.println(e);
		 }
		 System.out.println("----------");
		 double t=s1[0];
         for( i=1;i<5;++i)
		 {
			 s1[i-1]=s1[i];
		 }			
         s1[4]=t;		 
		 for(double e:s1)
		 {
			System.out.println(e);
		 }
		 System.out.println("----------");
	}
}