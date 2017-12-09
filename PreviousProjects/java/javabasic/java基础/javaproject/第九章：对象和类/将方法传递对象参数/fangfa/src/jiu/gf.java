package jiu;
public class gf
{
	public static void main(String[] args)
	{
		circle c=new circle(4.0);
		int n=6;
		m(c,n);
		System.out.println("radius is"+c.getradius());
		System.out.println("n is"+n);
	}
	public static void m( circle e,int j)
	{
		System.out.println("Radius \t\tArea");
		while(j>=1)
		{
			System.out.println(e.getradius()+"\t\t"+e.getarea());
			e.setradius(e.getradius()+1);;
			--j;
		}
	}
}
class circle
{
	double radius;
	circle(double n)
	{
		radius=n;
	}
	void setradius(double n)
	{
		radius=n;
	}
	double getradius()
	{
		return radius;
	}
	double getarea()
	{
		return Math.PI*radius*radius;
	}
}

