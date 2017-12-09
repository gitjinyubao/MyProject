import java.util.Scanner;
public class A 
{
    public static void main(String[] args)
	{
		 int i;
	     Scanner input=new Scanner(System.in);
		 System.out.println("Enter the length:");
		 int a=input.nextInt();
		 double[] s=new double[a];
		 System.out.println("please enter"+a+"numbers");
		 double sum=0;
		 for(i=0;i<a;++i)
		 {
			 s[i]=input.nextDouble();
			 sum+=s[i];
		 }
		 System.out.println("------------");
		 double avg=sum/a;
		 int t=1;
		 for(i=0;i<a;i++)
		 {
			 if(s[i]>avg)
			 {
				 t+=1;
				 System.out.println(i);
			 }
			 for(double e:s)
			 {
				 System.out.println(e);
			 }
		 }
		 System.out.println("------------");
	     System.out.println(t);
	}
}

