package 排队同步例子;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new A("金");
		A a2=new A("玉");
		A a3=new A("宝");
		Thread t1=new Thread(a1);
		Thread t2=new Thread(a2);
		Thread t3=new Thread(a3);
		t1.start();
		System.out.println("线程总数："+Thread.activeCount());
		t2.start();//此时t1还在执行，t2已经启动，进入待命状态，里面的语句还未进行执行
		System.out.println("线程总数："+Thread.activeCount());
		t3.start();
		System.out.println("线程总数："+Thread.activeCount());
	}
}
