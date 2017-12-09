package lei;
import java.awt.geom.Point2D;
import java.util.Scanner; 
public class diandian 
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the x1 and y1");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		System.out.println("Enter the x2 and y2");
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		Point2D m=new Point2D(x1,y1);
		Point2D n=new Point2D(x2,y2);
		System.out.println("m is"+m.toString());
		System.out.println("n is"+n.toString());
		System.out.println("The distance between m and n is"+m.distance(n));
	}
}