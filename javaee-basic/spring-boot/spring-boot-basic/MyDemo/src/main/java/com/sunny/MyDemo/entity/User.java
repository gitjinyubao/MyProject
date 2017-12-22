package com.sunny.MyDemo.entity;

import java.util.Date;

public class User {
	private Integer id;
	private String name;
	private Date birthday;
	private String sex;

	public User(Integer id, String name, Date birthday, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.sex = sex;
	}

	public User() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
