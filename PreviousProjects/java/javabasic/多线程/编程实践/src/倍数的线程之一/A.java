package 倍数的线程之一;

public class A {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		B b1=new B(7);
		B b2=new B(9);
		boolean a=true;
		long start=System.currentTimeMillis();
//		b1.run1();
//		b2.run1();//不用多线程需要的时间为：54微秒
		Thread t1=new Thread(b1);
		Thread t2=new Thread(b2);
		System.out.println("主线程的名称："+Thread.currentThread().getName());
		t1.setName("7的倍数");
		t2.setName("9的倍数");
		System.out.println("t1线程的名称："+t1.getName());
		System.out.println("t2线程的名称："+t2.getName());
		t1.start();
		t2.start();
		if(a)
		{
			
			Thread.sleep(1);
			if(t1.isAlive())
			{
				System.out.println("t1还在执行");
//				b1.Ting();
			}
			if(t2.isAlive())
			{
				System.out.println("t2还在执行");
				t2.interrupt();
			}
			long end=System.currentTimeMillis();
			System.out.println("时间："+(end-start));//使用多线程用时在5微秒之内
		}
		System.out.println("总的线程数目："+Thread.activeCount());
	}
}
