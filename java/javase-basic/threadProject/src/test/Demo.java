package test;

public class Demo {
	private int j;
    
	private synchronized void inc() {
		j--;
		System.out.println(Thread.currentThread().getName() + j);
	}
	
	private synchronized void desc() {
		j++;
		System.out.println(Thread.currentThread().getName() + j);
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		Thread t1 = new Thread(d.new A());
		t1.setName("ThreadOne");
		Thread t2 = new Thread(d.new B());
		t2.setName("ThreadTwo");
		
		t1.start();
		t2.start();
	}
	
	class A implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				inc();
			}
		}
	}

	class B implements Runnable {
		@Override
		public void run() {
			for (int i = 0; i < 100; i++) {
				desc();
			}
		}
	}
}
