package waitAndNotifyModify;

public class Student {
	private String name;
	private String sex;
	private boolean flag = false; // Ĭ����û�д���student
	
	public synchronized void set(String name, String sex) {
		if(this.flag) {
			try {
				this.wait(); // �����ͷ���
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
		
		// �޸�״̬
		this.flag = false;
		
		// ����
		this.notifyAll();
	}
}
