package Yu;

public class HelloWorld {
    
    //������һ��������Ϊ print �ķ�����ʵ�������Ϣ����
    public void print() {
		System.out.println("Hello World");
	}
    
    public static void main(String[] args){
        
        //�� main �����е��� print ����
        HelloWorld test=new HelloWorld();
        test.print();
        test.printOne();
    }
    public static void printOne()
    {
        System.out.println("Jin yu bao");
    }
}