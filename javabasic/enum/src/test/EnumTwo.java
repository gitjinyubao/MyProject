package test;

/*
 * ö�ٵ�����
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
