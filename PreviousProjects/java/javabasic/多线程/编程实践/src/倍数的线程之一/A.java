package �������߳�֮һ;

public class A {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		B b1=new B(7);
		B b2=new B(9);
		boolean a=true;
		long start=System.currentTimeMillis();
//		b1.run1();
//		b2.run1();//���ö��߳���Ҫ��ʱ��Ϊ��54΢��
		Thread t1=new Thread(b1);
		Thread t2=new Thread(b2);
		System.out.println("���̵߳����ƣ�"+Thread.currentThread().getName());
		t1.setName("7�ı���");
		t2.setName("9�ı���");
		System.out.println("t1�̵߳����ƣ�"+t1.getName());
		System.out.println("t2�̵߳����ƣ�"+t2.getName());
		t1.start();
		t2.start();
		if(a)
		{
			
			Thread.sleep(1);
			if(t1.isAlive())
			{
				System.out.println("t1����ִ��");
//				b1.Ting();
			}
			if(t2.isAlive())
			{
				System.out.println("t2����ִ��");
				t2.interrupt();
			}
			long end=System.currentTimeMillis();
			System.out.println("ʱ�䣺"+(end-start));//ʹ�ö��߳���ʱ��5΢��֮��
		}
		System.out.println("�ܵ��߳���Ŀ��"+Thread.activeCount());
	}
}
