package bao;

public class Integer {

public static void main(String[] args) {
        
		// ����int���ͱ�����ֵΪ86
		int score1 = 86; 
        
		// ����Integer��װ����󣬱�ʾ����score1��ֵ
		Integer score2=new Integer();
        
		// ��Integer��װ��ת��Ϊdouble����
		double score3=score2.doubleValue();
        
		// ��Integer��װ��ת��Ϊfloat����
		float score4=score2.floatValue();
        
		// ��Integer��װ��ת��Ϊint����
		int score5 =(int) score2.floatValue();

		System.out.println("Integer��װ�ࣺ" + score2);
		System.out.println("double���ͣ�" + score3);
		System.out.println("float���ͣ�" + score4);
	
}

private float floatValue() {
	// TODO Auto-generated method stub
	return 0;
}

private double doubleValue() {
	// TODO Auto-generated method stub
	return 0;
}
}
