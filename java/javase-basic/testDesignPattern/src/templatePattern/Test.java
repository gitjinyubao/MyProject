package templatePattern;

public class Test {
	
	public static void main(String[] args) {
		TimeTemplate t1 = new ForTime();
	    System.out.println(t1.getTime());
	    System.out.println("========================");
	    // ʹ��Whileѭ����Ч�ʸ�Щ
	    TimeTemplate t2 = new WhileTime();
	    System.out.println(t2.getTime());
	}
}
