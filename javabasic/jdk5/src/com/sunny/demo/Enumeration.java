package com.sunny.demo;

/*
 * ö��Ҳ�ǿ����й��췽�����ֶη���
 */
public class Enumeration {
	public static void main(String[] args) {
		System.out.println(Grade.A);
		System.out.println(Grade.A.getValue());
	}
}

enum Grade{ // class
	A("100"),B("90"),C("80"),D("80"); // object
	
	private String value; // ��װÿ�������Ӧ�ķ���
	
	private Grade(String value){
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
}