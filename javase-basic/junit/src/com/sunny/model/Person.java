package com.sunny.model;

public class Person {
	private int age;
	private String name;

	public Person() {
		super();
	}

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showAge() {
		System.out.println("年龄是:" + this.age);
	}

	public void showName() {
		System.out.println("姓名是:" + this.name);
	}

	public void showAll() {
		System.out.println("年龄" + this.age + "名字是" + this.name);
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

}
