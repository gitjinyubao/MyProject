package com.people;

import java.util.Properties;

public class People {
	private int age;
	private String weight;
	private  Properties  properties;

	public String getWeight() {
		return weight;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	
	//Bean�ĳ�ʼ������
	public   void  init()
	{
		this.age=10;
	}
	
	//Bean�����ٷ���
	public  void   destroy()
	{
		this.age=100;
	}
}
