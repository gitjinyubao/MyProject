package com.sunny.demo;

public enum Sex {
	A("��"),B("Ů");
	
	private String value;
	
	// ���췽������Ҫ��˽�е�
	private Sex(String value) {
		this.value = value;
	}
	
	public String getSex() {
		return this.value;
	}

}
