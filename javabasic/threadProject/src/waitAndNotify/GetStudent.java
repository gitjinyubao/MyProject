package waitAndNotify;

public class GetStudent extends Thread{
	private Student s;
	
	public GetStudent(Student s) {
		this.s = s;
	}
	
	@Override
	public void run() {
		while (true) {
			synchronized(s) {
				if (!s.flag) {
					try {
						s.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				System.out.println(s.name + ":" + s.sex);
				
				// ÐÞ¸Ä×´Ì¬
				s.flag = false;
				
				// »½ÐÑ
				s.notifyAll();
			}
		}
	}
}
