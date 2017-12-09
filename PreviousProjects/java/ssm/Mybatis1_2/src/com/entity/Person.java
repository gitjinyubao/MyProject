package com.entity;

import org.springframework.stereotype.Component;

@Component
public class Person {
	private    int   id;
	private    String   name;
	private    String   sex;
	private    IdCard   idCard;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public IdCard getIdCard() {
		return idCard;
	}
	public void setIdCard(IdCard idCard) {
		this.idCard = idCard;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", sex=" + sex
				+ ", idCard=" + idCard + "]";
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int id, String name, String sex, IdCard idCard) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.idCard = idCard;
	}
}
