package com.entity;
/*
 * ORM”≥…‰ µÃÂ¿‡Student
 * @author:   jin
 * @data  :   2017-03-09
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Student {
	private   int   id;
	private   String    stu_number;
	private   String    name;
	
	@Autowired
    private   StudentsClass  stu_cla;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStu_number() {
		return stu_number;
	}

	public void setStu_number(String stu_number) {
		this.stu_number = stu_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StudentsClass getStu_cla() {
		return stu_cla;
	}

	public void setStu_cla(StudentsClass stu_cla) {
		this.stu_cla = stu_cla;
	}

	public Student(int id, String stu_number, String name, StudentsClass stu_cla) {
		super();
		this.id = id;
		this.stu_number = stu_number;
		this.name = name;
		this.stu_cla = stu_cla;
	}
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", stu_number=" + stu_number + ", name="
				+ name + ", stu_cla=" + stu_cla + "]";
	}
}
