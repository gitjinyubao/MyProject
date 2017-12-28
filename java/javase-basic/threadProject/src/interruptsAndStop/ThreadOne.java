package interruptsAndStop;

import java.util.Date;

public class ThreadOne extends Thread {
	
	public ThreadOne (String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println("线程开始执行" + new Date());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(getName() + " 线程被终止了");
		}
		
		System.out.println("线程结束执行" + new Date());
	}
}
