package zhuanhua;

public class In {

public static void main(String[] args) {
	int a=2;
	Integer a1=new Integer(a);//�ֶ�װ��
	int a2=a;//�Զ�װ��
	System.out.println(a1);
	System.out.println(a2);
	
	
	
	int a3=(int)a1.doubleValue();//�ֶ�����
    int a4=a2;//�Զ�����
    System.out.println(a3);
    System.out.println(a4);
}
}
