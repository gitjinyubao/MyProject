import java.util.Scanner;
public class A 
{
    public static void main(String[] args)
	{
		
	     Scanner input=new Scanner(System.in);
		 System.out.println("Enter the length of arrea");
		 int a=input.nextInt();
		 double[] s1=new double[a];
		 for(int i=0;i<a;++i)
		 {
			 s1[i]=21+Math.random()*100;
		 }
		 System.out.println("Enter the number of arrea");
		 int b=input.nextInt();
		 System.out.println("-----------");
		 if(0<=b&&b<a)
		 {
			 System.out.println(s1[b]);
		 }
		 else
		 {
			 System.out.println("you are false");
		 }
		 System.out.println("");
		 System.out.println("-----------");
		 for(double e:s1)
		 {
			 System.out.println(e);
		 }
		 System.out.println("-----------");
		 for(int i=0;i<a;i++)
		 {
			 System.out.println(s1[i]+" ");
		 }
		 System.out.println("-----------");
		 for(int k=0;k<5;++k)
		 { 
	         double f; 
		     char [] s=new char[1];
			 f=97+Math.random() * 25;
			 s[0]=(char)f;
			 System.out.println(s[0]);
			 System.out.println("-----------");
		 }
		 double f=97.3;
		 char ch=(char)97.3;
		 System.out.println(ch);
	}
}

