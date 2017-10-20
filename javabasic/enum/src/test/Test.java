package test;

/*
 * 所有枚举类都是Enum的子类
 * 枚举中只能有私有的构造方法
 * 枚举类的第一行必须是枚举项
 */
public class Test {
	
	public static void main(String[] args) {
		
		System.out.println(EnumOne.FRONT);
		
		EnumTwo etw = EnumTwo.FRONT;
		System.out.println(etw.getName());
		
		EnumThree eth = EnumThree.FRONT;
		eth.show();
	}
}
