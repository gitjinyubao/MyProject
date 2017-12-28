package waitAndNotifyModify;

public class Student {
	private String name;
	private String sex;
	private boolean flag = false; // 默认是没有创造student
	
	public synchronized void set(String name, String sex) {
		if(this.flag) {
			try {
				this.wait(); // 立即释放锁
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.name = name;
		this.sex = sex;

		this.flag = true;
		this.notify();
	}
	
	public synchronized void get() {
		if (!this.flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(this.name + ":" + this.sex);
		
		// 修改状态
		this.flag = false;
		
		// 唤醒
		this.notifyAll();
	}
}
