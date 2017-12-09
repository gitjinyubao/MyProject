package lei;
import java.util.Random;
public class lei 
{
	public static void main(String[] args)
	{
		Random c=new Random(1000);
		System.out.print("From c1");
		for(int i=1;i<=10;++i)
		{
			System.out.print(5+c.nextInt(3)+" ");
		}
		System.out.print("From c2");
		for(int i=1;i<=10;++i)
		{
			System.out.print(c.nextInt(8)+" ");
		}
	}
}
