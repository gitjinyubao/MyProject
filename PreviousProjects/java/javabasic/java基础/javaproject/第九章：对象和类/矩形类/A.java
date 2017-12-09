public class A 
{
    public static void main(String[] args)
	{
		A1 jin=new A1(4,40);
		System.out.println("The area of the A1 of width and height"+jin.width+" "+jin.height+"is"+jin.getArea());
		System.out.println("The perimeter of the A1 of width and height"+jin.width+" "+jin.height+"is"+jin.getPerimeter());
		A1 jing=new A1(3.5,35.9);
		System.out.println("The area of the A1 of width and height"+jing.width+" "+jing.height+"is"+jing.getArea());
		System.out.println("The perimeter of the A1 of width and height"+jing.width+" "+jing.height+"is"+jing.getPerimeter());
		A1 jiang=new A1();
		System.out.println("The area of the A1 of width and height"+jiang.width+" "+jiang.height+"is"+jiang.getArea());
		System.out.println("The perimeter of the A1 of width and height"+jiang.width+" "+jiang.height+"is"+jiang.getPerimeter());
	}

}
class A1
{
	double width=1,height=1;
	A1()
	{
		width=2;
		height=3;
	}
	A1(double n,double m)
	{
		width=n;
		height=m;
	}
	double getArea()
	{
		return width*height;
	}
	double getPerimeter()
	{
		return 2*(width+height);
	}
	void setWidth(double n)
	{
		width=n;
	}
	void setHeight(double m)
	{
		height=m;
	}
}
