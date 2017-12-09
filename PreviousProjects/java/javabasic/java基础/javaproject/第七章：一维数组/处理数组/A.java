import java.util.Scanner;
public class A 
{
    public static void main(String[] args)
	{
	     Scanner input=new Scanner(System.in);
		 System.out.println("Enter the length :");
	     int a=input.nextInt();
		 double[] s=new double[a];
		 for(int i=0;i<a;i++)
		 {
			 s[i]=97+Math.random() *25;
		 }
		 for(double e:s)
		 {
			 System.out.println(e);
		 }
		 System.out.println("-----------");
		 for(int i=0;i<a;i++)
		 {
			 s[i]=97+Math.random() *25;
			 System.out.println(s[i]);
		 }
		 System.out.println("-----------");
		  double m=0;
		  for(int i=0;i<a;++i)
		   {
			  m+=s[i];
		   }
		   System.out.println(m);
	       System.out.println("-----------"); 
		 if(a>0)
		 {
			 char[] s1=new char[a];
			 for(int i=0;i<a;++i)
		   {
			   double k;
			   k=97+Math.random() *25;
			   s1[i]=(char)k;
			   System.out.println(s1[i]);
	       }
		     System.out.println("-----------");
		     System.out.print(s1);
		     System.out.println("-----------");
		    
		 }
		 double max=s[0];
		 for(int i=1;i<a;i++)
		 {
			 if(max<s[i])
			 {
				 max=s[i];
			 }
			 else
			 {
				 max=max;
			 }
		 }
		 System.out.println(max);
	}
}

