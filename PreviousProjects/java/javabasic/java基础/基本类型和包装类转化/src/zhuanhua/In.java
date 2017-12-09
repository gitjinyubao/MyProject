package zhuanhua;

public class In {

public static void main(String[] args) {
	int a=2;
	Integer a1=new Integer(a);//手动装箱
	int a2=a;//自动装箱
	System.out.println(a1);
	System.out.println(a2);
	
	
	
	int a3=(int)a1.doubleValue();//手动拆箱
    int a4=a2;//自动拆箱
    System.out.println(a3);
    System.out.println(a4);
}
}
