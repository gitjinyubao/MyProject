package test;

import java.util.List;

import dao.StuScoreDao;
import dao.StudentDao;
import dao.impl.StuScoreDaoImpl;
import dao.impl.StudentDaoImpl;
import model.StuScore;
import model.Student;

public class Test {
	public static void main(String[] args) {
		StudentDao stuDao = new StudentDaoImpl();
		
		stuDao.updateStudent("davidJin", 3);
		
		List<Student> list = stuDao.getStudents();
		for (Student s : list) {
			System.out.println(s.toString());
		}
		
		System.out.println("==================");
		StuScoreDao ssDao = new StuScoreDaoImpl();
		List<StuScore> listScore = ssDao.getStuScores();
		for (StuScore ss : listScore) {
			System.out.println(ss.toString());
		}
	}
}
