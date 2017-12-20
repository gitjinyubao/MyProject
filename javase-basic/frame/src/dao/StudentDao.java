package dao;

import java.util.List;

import model.Student;

public interface StudentDao  {
	
	public List<Student> getStudents();
	
	public int deleteStudentById(Object...objects);
	
	public int updateStudent(Object...objects);
	
	public int addStudent(Object...objects);
}
