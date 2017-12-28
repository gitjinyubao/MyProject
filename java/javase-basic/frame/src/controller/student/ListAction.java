package controller.student;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.Controller;
import dao.StudentDao;
import dao.impl.StudentDaoImpl;
import model.Student;
import service.StudentService;

public class ListAction implements Controller {
	private StudentService studentServerce;
	
	public StudentService getStudentServerce() {
		return studentServerce;
	}

	public void setStudentServerce(StudentService studentServerce) {
		this.studentServerce = studentServerce;
	}

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		StudentDao sd = new StudentDaoImpl();
		List<Student> list = new ArrayList<Student>();
		list = sd.getStudents();
		request.setAttribute("studentList", list);
		return "/student-list.jsp";
	}
}
