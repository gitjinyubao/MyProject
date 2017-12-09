import java.util.Scanner;
public class Area
{
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
	    System.out.print("enter the radius of the area:");
		double radius=input.nextDouble(); 
		double area=radius*radius*3.14;
		System.out.println("The area for the circle of radius"+radius+"is"+area);
	}
}