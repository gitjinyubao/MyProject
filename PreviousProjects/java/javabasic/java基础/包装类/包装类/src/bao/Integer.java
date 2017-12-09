package bao;

public class Integer {

public static void main(String[] args) {
        
		// 定义int类型变量，值为86
		int score1 = 86; 
        
		// 创建Integer包装类对象，表示变量score1的值
		Integer score2=new Integer();
        
		// 将Integer包装类转换为double类型
		double score3=score2.doubleValue();
        
		// 将Integer包装类转换为float类型
		float score4=score2.floatValue();
        
		// 将Integer包装类转换为int类型
		int score5 =(int) score2.floatValue();

		System.out.println("Integer包装类：" + score2);
		System.out.println("double类型：" + score3);
		System.out.println("float类型：" + score4);
	
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
