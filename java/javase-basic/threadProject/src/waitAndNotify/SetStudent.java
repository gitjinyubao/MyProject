package waitAndNotify;

public class SetStudent extends Thread {
    private Student s;
    private static int x = 0;
	
	public SetStudent(Student s) {
		this.s = s;
	}
	
	@Override
	public void run() {
		while (true) {
			synchronized(s) {
				if(s.flag) {
					try {
						s.wait(); // ¡¢º¥ Õ∑≈À¯
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				if (x % 2 == 0) {
					s.name = "a";
					s.sex = "a";
				} else {
					s.name = "b";
					s.sex= "b";
				}
				
				++x;
				s.flag = true;
				s.notify();
			}
		}
	}
}
