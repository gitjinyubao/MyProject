package er_zhang_xi_ti;

public class C 
{
	public static void main(String[] args)
	{
		int score=53;
		int count=0;
		int score1=score;
		do
		{
			++count;
			score++;
		}while(score1<60);
		System.out.println(score);
		System.out.println(score1);
		System.out.println(count);
	}

}
