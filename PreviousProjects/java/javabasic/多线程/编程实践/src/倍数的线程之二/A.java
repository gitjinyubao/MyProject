package �������߳�֮��;

public class A extends Thread{
	 public int b;
	public A(int a1)
	{
		b=a1;
	}
	public void run()
	{
		for(int i=1;i<=5;++i)
		{
			int m=i*b;
			System.out.println(i+"*"+b+"�ı�����"+m);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	}