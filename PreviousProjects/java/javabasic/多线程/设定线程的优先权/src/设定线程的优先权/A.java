package 设定线程的优先权;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B();
		B b2=new B();
		B b3=new B();
		Thread t=new Thread(b1);
		Thread t1=new Thread(b2);
		Thread t2=new Thread(b2);
		t.setName("金");
	    t1.setName("玉");
	    t2.setName("宝");
		//System.out.println("总的线程数目："+Thread.activeCount());
		System.out.println("main的优先权值为："+Thread.currentThread().getPriority());
		System.out.println("t的优先权值为："+t.getPriority());
		System.out.println("t1的优先权值为："+t1.getPriority());
		System.out.println("t2的优先权值为："+t2.getPriority());
		t.start();
		t1.start();
		t2.start();//只会执行方法run()中的
		t.setPriority(10);
		t2.setPriority(7);
		t1.setPriority(3);
		
		//设定优先权值
		try {
			Thread.sleep(1800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t.getName()+"执行："+b1.Counter()+"次");
		System.out.println(t1.getName()+"执行："+b2.Counter()+"次");
		System.out.println(t2.getName()+"执行："+b3.Counter()+"次");

	}
}
