package fangfa;

public class fa
{
	
	public static void main(String[] args)
	{
		circle c=new circle(4);
		m(c);
	}
	public static void m(circle a)
	{
		System.out.println(a.radius+" "+a.getarea());
	}
}
class circle
{
	double radius;
	circle(double n)
	{
		radius=n;
	}
	void setRadius(double n)
	{
		radius=n;
	}
	double getRadius()
	{
		return radius;
	}
	double getarea()
	{
		return Math.PI*radius*radius;
	}
}
