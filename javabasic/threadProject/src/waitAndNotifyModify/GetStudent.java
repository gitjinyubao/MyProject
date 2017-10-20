package waitAndNotifyModify;

public class GetStudent extends Thread{
	private Student s;
	
	public GetStudent(Student s) {
		this.s = s;
	}
	
	@Override
	public void run() {
		while (true) {
			s.get();
		}
	}
}
