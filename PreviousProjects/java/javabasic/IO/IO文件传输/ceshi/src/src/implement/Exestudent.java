package implement;

import java.util.List;

import Function.Dostudent;

import enttity1.Student;

public class Exestudent {
	public Exestudent()
	{
		
	}
	public List<Student> getAllname() throws Exception
	{
		Dostudent  d=new Dostudent();
		List<Student> l1=d.getnumber();
		return l1;	
	}
}
