package fangfa;
public class changliang 
{
	public static void main(String[] args)
	{
		circle c1=new circle();
	    circle c2=new circle(3);
	    System.out.println("The one area is"+c1.getarea());
	    System.out.println("The two area is"+c2.getarea());
	    System.out.println("the circles numbers is"+c1.getnumber());
	}
}
class circle
{
	final static  double p=3.14159;
	static int numbersofcircle=0;
	double radius;
	circle()
	{
		radius=2;
		++numbersofcircle;
	}
	circle(double newradius)
	{
		radius=newradius;
		++numbersofcircle;
	}
	double getarea()
	{
		return p*radius*radius;
	}
	static int getnumber()
	{
		return numbersofcircle;
	}
}
