package com.sunny.demo;

/*
 * 枚举也是可以有构造方法和字段方法
 */
public class Enumeration {
	public static void main(String[] args) {
		System.out.println(Grade.A);
		System.out.println(Grade.A.getValue());
	}
}

enum Grade{ // class
	A("100"),B("90"),C("80"),D("80"); // object
	
	private String value; // 封装每个对象对应的分数
	
	private Grade(String value){
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
}