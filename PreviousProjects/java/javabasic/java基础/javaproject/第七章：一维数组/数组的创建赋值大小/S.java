public class S
{
	public static void main(String[] args)
	{
		double[] s=new double[3];
		double[] s1={1,2,3,4};
		double[] s2=new double[5];
		for(int i=1;i<5;++i)
		{
			s2[i]=i+s2[i-1];
		}
		s2[0]=s2[1]+s2[2];
		s[0]=1.1;
		s[1]=2.0;
		s[2]=1.7;
		System.out.println(s[0]);
		System.out.println(s.length);
		System.out.println(s1[2]);
		System.out.println(s1.length);
		System.out.println(s2[0]);
		System.out.println(s2.length);
	}
}