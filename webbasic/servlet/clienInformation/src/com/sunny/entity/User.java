package com.sunny.entity;

public class User {
	private String username;
	private int age;
	private String sex;
	private String[] hobby;

	public User(String username, int age, String sex) {
		super();
		this.username = username;
		this.age = age;
		this.sex = sex;
	}

	public User() {
	}
	
	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
