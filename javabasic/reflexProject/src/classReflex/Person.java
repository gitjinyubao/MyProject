package classReflex;

public class Person {
	public String name;
	private String sex;
	
	public Person() {
		System.out.println("无参数构造函数被调用了");
	}
	
	public Person(String name) {
		this.name = name;
		System.out.println("有参数构造函数被调用了");
	}
	
	private Person(String name, String sex) {
		this.sex = sex;
		this.name = name;
	}

	public void show() {
		System.out.println(this.name + this.sex);
	}
	
	private void printName(String word) {
		System.out.println(word);
	}
}
