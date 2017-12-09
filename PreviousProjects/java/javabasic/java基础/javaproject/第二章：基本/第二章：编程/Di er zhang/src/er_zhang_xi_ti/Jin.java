package er_zhang_xi_ti;

public class Jin 
{
	public static void main(String[] args)
	{
		String today="周末";
		String weather="晴朗";
		if(today.equals("周末"))
		{
			if(weather.equals("晴朗"))
			{
				System.out.println("可以出去玩！");
			}
			else
			{
				System.out.println("在室内玩耍！");
			}
		}
		else
		{
			System.out.println("不能玩耍！");
		}
	}

}
