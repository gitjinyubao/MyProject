package dieLock;

public class MyThreads extends Thread {
	private Boolean flag = true;
	
	public MyThreads(Boolean flag) {
		this.flag = flag;
	}
	
	@Override
	public void run() {
		if (flag) {
			synchronized (Locks.object1) {
				System.out.println("if object1");
				synchronized (Locks.object2) {
					System.out.println("if object2");
				}
			}
		} else {
			synchronized (Locks.object2) {
				System.out.println("else object2");
				synchronized (Locks.object1) {
					System.out.println("else object1");
				}
			}
		}
	}
}
