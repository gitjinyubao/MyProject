package test;

/*
 * 枚举调用方法
 */
public enum EnumThree {
	FRONT("David"), LEFT("Alice"), RIGHT("Toby");
	
	private String name;
	
	private EnumThree(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void show() {
		System.out.println("我是：" + this.name);
	}
}
