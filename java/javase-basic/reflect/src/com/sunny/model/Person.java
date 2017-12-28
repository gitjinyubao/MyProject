package com.sunny.model;

import java.io.InputStream;

public class Person {
	private int age;
	private String name;
	public static String sex;
	public int weight;

	public int getAge() {
		return age;
	}

	public Person() {
		super();
	}

	public Person(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public Person(int age, String name, int weight,String sex) {
		super();
		this.age = age;
		this.name = name;
		this.weight = weight;
		this.sex = sex;
	}

	@SuppressWarnings("unused")
	private Person(int age) {
		super();
		this.age = age;
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

	public void showName(String name) {
		System.out.println(name);
	}

	public void showName() {
		System.out.println("alice");
	}

	@SuppressWarnings("rawtypes")
	public Class[] getClassNum(String name, int[] password) {
		return new Class[] { String.class };
	}

	@SuppressWarnings("unused")
	private void addInputStream(InputStream in) {
		System.out.println(in);
	}

	public static void eat(int num) {
		System.out.println("eat number:" + num);
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
	public static void main(String[] args) {
		System.out.println("main");
	}
}
