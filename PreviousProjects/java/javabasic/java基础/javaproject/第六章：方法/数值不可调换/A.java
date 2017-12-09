public class A 
{
    public static void main(String[] args)
	{
		int a=1;
		int b=2;
		System.out.println("Before swap"+a+" "+b);
		swap(a,b);
		System.out.println("After swap two"+a+" "+b);
	}
	public static void swap(int n,int m)
	{
		System.out.println("Before swap two"+n+" "+m);
		int t;
		t=n;
		n=m;
		m=t;
		System.out.println("After swap"+n+" "+m);
	}
}
