package service;

import dao.StudentDao;

public class StudentService {
	private StudentDao stuDao;
	
	public int insertStudent(Object...objects) {
		return stuDao.addStudent(objects);
	}

}
