package test;

/*
 * 枚举调构造
 */
public enum EnumTwo {
	FRONT("David"), LEFT("Alice"), RIGHT("Toby");
	
	private String name;
	
	private EnumTwo(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
