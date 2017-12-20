package templatePattern;

public class Test {
	
	public static void main(String[] args) {
		TimeTemplate t1 = new ForTime();
	    System.out.println(t1.getTime());
	    System.out.println("========================");
	    // 使用While循环的效率高些
	    TimeTemplate t2 = new WhileTime();
	    System.out.println(t2.getTime());
	}
}
