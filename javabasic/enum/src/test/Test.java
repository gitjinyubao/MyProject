package test;

/*
 * ����ö���඼��Enum������
 * ö����ֻ����˽�еĹ��췽��
 * ö����ĵ�һ�б�����ö����
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
