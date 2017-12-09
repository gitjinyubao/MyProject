package com.entity;

/*
 * ORM”≥…‰ µÃÂ¿‡StudentsClass
 * @author:   jin
 * @data  :   2017-03-09
 */

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class StudentsClass {
	private   int    id;
	private   String   classNumber;
	
	@Autowired
	private   List<Student>   list;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(String classNumber) {
		this.classNumber = classNumber;
	}

	

	public StudentsClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentsClass(int id, String classNumber, List<Student> list) {
		super();
		this.id = id;
		this.classNumber = classNumber;
		this.list = list;
	}

	@Override
	public String toString() {
		return "StudentsClass [id=" + id + ", classNumber=" + classNumber
				+ ", list=" + list + "]";
	}
	

}
