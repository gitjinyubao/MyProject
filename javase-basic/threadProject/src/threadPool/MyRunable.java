package threadPool;

public class MyRunable implements Runnable{
	
	public MyRunable() {
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
