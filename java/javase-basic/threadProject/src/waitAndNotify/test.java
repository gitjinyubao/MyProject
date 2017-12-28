package waitAndNotify;

public class test {
	
	public static void main(String[] args) {
	    Student s = new Student();
		SetStudent setStudent = new SetStudent(s);
		GetStudent getStudent = new GetStudent(s);
		setStudent.start();
		getStudent.start();
	}
}
