package JinYuBao;

public class Nian 
{

	public static void main(String[] args)
	{
		int[]array={18 ,23 ,21 ,19 ,25 ,29 ,17};
		int max;
		Nian c=new Nian();
        max=c.Array(7);
        System.out.println("The max is"+max);
	}
	public int[]Array(int length)
	{
		int maxone;
		maxone=Array[0];
		for(int i=1;i<=length;++i)
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



