package interruptsAndStop;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		ThreadOne thread1 = new ThreadOne("�߳�1");
		thread1.start();
		
		try {
			Thread.sleep(10000);
			// thread1.stop();
			thread1.interrupt();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
