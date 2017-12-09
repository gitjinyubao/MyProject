package 检验synchronized;

public class A implements Runnable{
	private String name;
	public A(String name1)
	{
		name=name1;
	}
	public void run()
	{
	    show();
	}
	public  synchronized void show()
	{
		System.out.println(name);
	}
//使用了 synchronized修饰的方法，在同一时间只能让一个线程执行，排队执行
}
