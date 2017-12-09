public class A 
{
    public static void main(String[] args)
	{
	     int[] s={1,2};
		 swap(s[0],s[1]);
		 System.out.println("array is {"+s[0]+","+s[1]+"}");
		 twoswapP(s);
		 System.out.println("array is {"+s[0]+","+s[1]+"}");
	}
	public static void swap(int num1,int num2)
	{
		int t=num1;
		num1=num2;
		num2=t;
	}
	public static void twoswapP(int[] p)
	{
		int m=p[0];
		p[0]=p[1];
		p[1]=m;
	}
}

