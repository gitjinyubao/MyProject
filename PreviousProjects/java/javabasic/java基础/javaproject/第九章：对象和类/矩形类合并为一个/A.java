public class A 
{
    public static void main(String[] args)
	{
		int x=0;
		System.out.println("x is"+x); 
		A c=new A(1,2);
		System.out.println("the area width height"+c.width+c.height+c.area());
		c.width=3;
		c.height=4;
		System.out.println("the area is"+c.area()); 
		A c1=new A();
		System.out.println("the area is"+c1.area());
	}
	double width=5;
	double height=5;
	A()
	{
		width=3;
		height=3;
	}
	A(double a,double b)
	{
		width=a;
		height=b;
	}
	double area()
	{
		return width*height;
	}
	
}

