package dieLock;

public class DieLockDemo {

	public static void main(String[] args) {
		MyThreads m1 = new MyThreads(true);
		MyThreads m2 = new MyThreads(false);

		m1.start();
		m2.start();
	}
}
