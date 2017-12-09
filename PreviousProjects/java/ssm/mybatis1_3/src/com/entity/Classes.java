package com.entity;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Classes {
	private   int   id;
	private   int   class_number;
	private   String   class_name;
	private   List<Student>   list;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getClass_number() {
		return class_number;
	}
	public void setClass_number(int class_number) {
		this.class_number = class_number;
	}
	public String getClass_name() {
		return class_name;
	}
	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}
	public List<Student> getList() {
		return list;
	}
	public void setList(List<Student> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Classes [id=" + id + ", class_number=" + class_number
				+ ", class_name=" + class_name + ", list=" + list + "]";
	}
	
	
	public  String printlnAllClass(){
		return "Classes [id=" + id + ", class_number=" + class_number
				+ ", class_name=" + class_name + "]";
	}
	public Classes(int id, int class_number, String class_name,
			List<Student> list) {
		super();
		this.id = id;
		this.class_number = class_number;
		this.class_name = class_name;
		this.list = list;
	}
	public Classes() {
		super();
		// TODO Auto-generated constructor stub
	}
}
