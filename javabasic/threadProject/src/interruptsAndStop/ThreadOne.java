package interruptsAndStop;

import java.util.Date;

public class ThreadOne extends Thread {
	
	public ThreadOne (String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println("�߳̿�ʼִ��" + new Date());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println(getName() + " �̱߳���ֹ��");
		}
		
		System.out.println("�߳̽���ִ��" + new Date());
	}
}
