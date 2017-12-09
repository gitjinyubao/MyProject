package YuJu;
import java.util.Scanner;
public class Boolean 
{
	public static void main(String[] args)
	{
		int count=0;
	    int right=0;
		for(int i=1;;++i)
		{
			boolean y=true;//判断真假
            Scanner input=new Scanner(System.in);	
			double a=1+Math.random()*100;//采用此方式得到的为double形式的任意值
			int c=(int)a;//必须单独一行将其进行转换才可以得到不同的int值
			double b=2+Math.random()*100;//采用此方式得到的为double形式的任意值
			int d=(int)b;//必须单独一行将其进行转换才可以得到不同的int值
			System.out.println(c+"+"+d+"="+"?");
			int answer=input.nextInt();
			if(c==d)
			{
				y=false;
				break;
			}
			if(c!=d)
			{
				++count;
				y=true;
				if(answer==(c+d))
				{
					System.out.println("you are right!");
					++right;
				}
				else
				
				{
					System.out.println("you are false!");
				}
			}
			if(count>99)
			{
				break;
			}
		}
		System.out.println("grade is"+right);
	}
}
