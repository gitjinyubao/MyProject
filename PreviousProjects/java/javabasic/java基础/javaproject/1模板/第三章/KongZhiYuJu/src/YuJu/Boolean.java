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
			boolean y=true;//�ж����
            Scanner input=new Scanner(System.in);	
			double a=1+Math.random()*100;//���ô˷�ʽ�õ���Ϊdouble��ʽ������ֵ
			int c=(int)a;//���뵥��һ�н������ת���ſ��Եõ���ͬ��intֵ
			double b=2+Math.random()*100;//���ô˷�ʽ�õ���Ϊdouble��ʽ������ֵ
			int d=(int)b;//���뵥��һ�н������ת���ſ��Եõ���ͬ��intֵ
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
