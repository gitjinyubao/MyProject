package 线程之间的通信;


public class A extends Thread{
 public int a;
public A(int a1)
{
	a=a1;
}
public void run()
{
	for(int i=1;1<=5;++i)
	{
		int m=i*a;
		System.out.println(i+"*"+a+"的倍数："+m);
		 System.out.flush();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
