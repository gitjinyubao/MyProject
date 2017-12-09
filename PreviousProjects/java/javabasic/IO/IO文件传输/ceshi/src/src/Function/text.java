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
	    s.setCourse("数据结构");
	    s.setNumber("1402140097");
	    s.setPassword("1934jy26");
	    s.setRemarks("团员");
	    s.setSex("男");
	    s.setSystem("软件工程");
	    s.setUsername("金玉宝");
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
