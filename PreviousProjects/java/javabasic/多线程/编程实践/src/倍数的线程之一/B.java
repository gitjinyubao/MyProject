package 倍数的线程之一;

public class B implements Runnable  {
public int i;
public B(int i1)
{
	i=i1;
}
public void run()
{
	for(int r=1;r<2000;++r)
	{
		
			int s=r*i;
			System.out.println(r+"*"+i+"的倍数为："+s);
			System.out.flush();
		
	}	
}
//public void Ting()
//{
//	a1=false;
//}
}
