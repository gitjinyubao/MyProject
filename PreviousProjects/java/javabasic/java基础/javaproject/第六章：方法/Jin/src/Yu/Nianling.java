package Yu;

public class Nianling
{
	public static void main(String[] args)
	{
		int[]array={18 ,23 ,21 ,19 ,25 ,29 ,17};
		int max;
		Nianling c=new Nianling();
        max=c.max(7,int[]array );
        System.out.println("The max is"+max);
	}
	public int max(int number,int [] Array)
	{
		int maxone;
		maxone=Array[0];
		for(int i=1;i<=number;++i)
		{
			if(Array[i]>maxone)
			{
				maxone=Array[i];
			}
			else
			{
				maxone=maxone;
			}
		}
		return maxone;
	}
}
