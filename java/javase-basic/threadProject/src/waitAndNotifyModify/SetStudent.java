package waitAndNotifyModify;

public class SetStudent extends Thread {
    private Student s;
    private int x  = 0;
    
	
	public SetStudent(Student s) {
		this.s = s;
	}
	
	@Override
	public void run() {
		while (true) {
			
			if (x % 2 == 0) {
				s.set("a", "a");
			} else {
				s.set("b", "b");
			}
			
			x++;
		}
	}
}
