package classReflex;

public class Person {
	public String name;
	private String sex;
	
	public Person() {
		System.out.println("�޲������캯����������");
	}
	
	public Person(String name) {
		this.name = name;
		System.out.println("�в������캯����������");
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
