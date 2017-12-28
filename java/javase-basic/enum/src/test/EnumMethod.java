package test;

public class EnumMethod {
	/*
	 * 常用的枚举类方法：
	 *              1. String name()
	 *              2. int ordinal() 返回枚举的序号
	 *              3. <T> T valueOf(Class<T> type, String name)
	 *              4. values() 遍历枚举
	 *              5. int compareTo(E o)
	 */
	
	public static void main(String[] args) {
		// Eg: 3
		EnumThree et = Enum.valueOf(EnumThree.class, "FRONT");
		System.out.println(et.getName());
		
		// Eg: 4
		EnumThree[] ets = EnumThree.values();
		for (EnumThree e : ets) {
			System.out.println(e.getName());
		}
	}
}
