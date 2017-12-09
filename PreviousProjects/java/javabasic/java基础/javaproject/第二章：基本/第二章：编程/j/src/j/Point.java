package j;

public class Point {
	public static void main(String[] args){
      Point2D p21=new Point2D();
 System.out.println("p21:"+"("+p21.getX()+","+p21.getY()+")");
      Point2D p22=new Point2D(3,2);
System.out.println("p22:"+"("+p22.getX()+","+p22.getY()+")");
      double d12=Math.sqrt((p21.getX()-p22.getX())*(p21.getX()-p22.getX())
      +(p21.getY()-p22.getY())*(p21.getY()-p22.getY()));
      System.out.println("p21和p22之间的距离："+d12);
      p21.offset(2,2);
      System.out.println("重置后的p21  p21:");
      System.out.println("p21:"+"("+p21.getX()+","+p21.getY()+")");
      System.out.print("p31:");
      Point3D p31=new Point3D();
      System.out.print("p32:");
      Point3D p32=new Point3D(2,2,2);
      double d23=Math.sqrt((p31.getX()-p32.getX())*(p31.getX()-p32.getX())
    	      +(p31.getY()-p32.getY())*(p31.getY()-p32.getY())
    	      +(p31.getZ()-p32.getZ())*(p31.getZ()-p32.getZ()));
      System.out.println("p31和p32之间的距离："+d23);
      System.out.print("p33:");
      Point3D p33=new Point3D(p21,3);
 	} 
}
class Point2D
{
   private int x;
   private int y;
   public Point2D()
   {
	   x=1;
	   y=1;
 }
   public Point2D(int m,int n)
   {
	   x=m;
	   y=n;
   }
   int getX()
   {
	   return x;
   }
   int getY()
   {
	   return y;
   }
   public void offset(int a,int b)
   {
	   x=a;
	   y=b;
  }
 }
class Point3D extends Point2D
{
	private int x;
	private int y;
	private int z;
	Point3D()
	{
		x=1;
		y=1;
		z=1;
		System.out.println("("+x+","+y+","+z+")");
	}
    Point3D(int x,int y,int z)
    {
    	System.out.println("("+x+","+y+","+z+")");
    }
    Point3D(Point2D p,int z)
    {
    	System.out.println("("+p.getX()+","+p.getY()+","+z+")");
    }
    int getX()
    {
 	   return x;
    }
    int getY()
    {
 	   return y;
    }
    int getZ()
    {
    	return z;
    }
    public void offset(int a,int b,int c)
    {
 	  x=a;
 	  y=b;
 	  z=c;
 	  System.out.println("("+x+","+y+","+z+")");
    }
}