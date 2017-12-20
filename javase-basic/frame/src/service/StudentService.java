package service;

import java.util.List;

import dao.StudentDao;
import dao.impl.StudentDaoImpl;
import model.Student;

public class StudentService {
	private StudentDao studentDao;
	
	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDaoImpl studentDao) {
		this.studentDao = studentDao;
	}

	public List<Student> getStudents() {
		return studentDao.getStudents();
	}
}
