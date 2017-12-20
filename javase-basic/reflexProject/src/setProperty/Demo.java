package setProperty;

public class Demo {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		SetProperty sp = new SetProperty();
		
		Person p = new Person();
		sp.setProperty(p, "name", "david");
		sp.setProperty(p, "age", 23);
		p.show();
	}
}

class Person {
	private String name;
	public int age;
	
	public void show() {
		System.out.println(this.name + ":" + this.age);
	}
}
