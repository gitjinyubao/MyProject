package 排队同步例子;

public class A implements Runnable{
	private  long sum=0;
	private String name;
	public A(String name1)
	{
		name=name1;	
	}
	public void run()
	{
		for(int i=1;i<=5;++i)
		{
			add(name,1000);
		}
	}
	public synchronized void add(String name,long m)
	{
		
		  sum+=m;
		  System.out.println(name+"存入"+"m"+"总款"+sum);
	}
}
