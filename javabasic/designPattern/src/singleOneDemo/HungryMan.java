package singleOneDemo;

public class HungryMan {
	
	private HungryMan() {
	}
	
	// 静态的随着类的加载而加载,类加载的时候就创建对象
	private static HungryMan hm = new HungryMan();
	
	public static HungryMan getHungryMan() {
		return hm;
	}
}
