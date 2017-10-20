package test;

public class EnumMethod {
	/*
	 * ���õ�ö���෽����
	 *              1. String name()
	 *              2. int ordinal() ����ö�ٵ����
	 *              3. <T> T valueOf(Class<T> type, String name)
	 *              4. values() ����ö��
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
