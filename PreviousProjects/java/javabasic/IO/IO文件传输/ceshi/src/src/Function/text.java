package Function;

import enttity1.Student;

public class text {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
	    s.setBirthday("1994-02-06");
	    s.setClasss("1402");
	    s.setCourse("���ݽṹ");
	    s.setNumber("1402140097");
	    s.setPassword("1934jy26");
	    s.setRemarks("��Ա");
	    s.setSex("��");
	    s.setSystem("�������");
	    s.setUsername("����");
	    s.setPassword1("1934jy26");
	    Dostudent  d=new Dostudent();
	    try {
			d.add_student(s);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
