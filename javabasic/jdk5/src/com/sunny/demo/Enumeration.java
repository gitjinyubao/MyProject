package com.sunny.demo;

/*
 * 枚举也是可以有构造方法和字段方法
 */
public class Enumeration {
	public static void main(String[] args) {
		System.out.println(Grade.A);
		System.out.println(Grade.A.getValue());
		// 枚举的常用方法
		System.out.println(Grade.A.name()); // 返回此枚举常量的名称，在其枚举声明中对其进行声明。
		System.out.println(Grade.A.ordinal()); // 返回枚举常量的序数（它在枚举声明中的位置，其中初始常量序数为零）。
		// 返回枚举常量的名称，它包含在声明中
		System.out.println(Grade.A.toString());
		// 返回带指定名称的指定枚举类型的枚举常量 valueOf(Class<T> enumType, String name) 
		Grade g =  Grade.valueOf(Grade.class, "A"); // == Grade g =  Grade.valueOf("A"); //字符串只能对象是枚举中有的
		System.out.println(g); // 典型应用 :客户端提交一个字符串，性别，检查是不是枚举中的值，如果不是进入异常
		
		System.out.println("=================");
		System.out.println(Grades.A.getValue());
		System.out.println(Grades.B.getValue());
		
		// 返回枚举类型数组
		Grade[] grades = Grade.values();
		for(Grade e : grades) {
			System.out.println(e);
		}
	}
}

enum Grade { // class
	A("100"), B("90"), C("80"), D("80"); // object

	private String value; // 封装每个对象对应的分数

	private Grade(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
}

// 带有抽象方法的枚举
enum Grades{
	A("100")
	{
		public String getLocalValue(){
			return "优秀";
		}
	},
	
	B("90"){
		public String getLocalValue(){
			return "良好";
		}
	},
	
	C("80"){
		public String getLocalValue(){
			return "及格";
		}
	},

	D("70"){
		public String getLocalValue(){
			return "不及格";
		}
	};
	
	private String value;
	
	private Grades(String value){
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
	
	// 定义抽象方法
	public abstract String getLocalValue();
}

/*
 * 注意事项：
 * 1.枚举的构造方法必须是私有的
 * 2.枚举是可以拥有抽象方法的
 * 3.枚举是可以继承或者实现类或者是接口的
 * 4.若枚举只有一个枚举值，则可以当作单态设计模式使用
 */

// 用单态设计模式定义出一个类==类的单例模式
enum A {
	A;
}