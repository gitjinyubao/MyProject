package singleOneDemo;

public class HungryMan {
	
	private HungryMan() {
	}
	
	// ��̬��������ļ��ض�����,����ص�ʱ��ʹ�������
	private static HungryMan hm = new HungryMan();
	
	public static HungryMan getHungryMan() {
		return hm;
	}
}
