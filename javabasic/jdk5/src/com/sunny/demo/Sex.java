package com.sunny.demo;

public enum Sex {
	A("男"),B("女");
	
	private String value;
	
	// 构造方法必须要是私有的
	private Sex(String value) {
		this.value = value;
	}
	
	public String getSex() {
		return this.value;
	}

}
