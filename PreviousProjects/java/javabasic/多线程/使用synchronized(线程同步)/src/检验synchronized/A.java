package ����synchronized;

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
//ʹ���� synchronized���εķ�������ͬһʱ��ֻ����һ���߳�ִ�У��Ŷ�ִ��
}
