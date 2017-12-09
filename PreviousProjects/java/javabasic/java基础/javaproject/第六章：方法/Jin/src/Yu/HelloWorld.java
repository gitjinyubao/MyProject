package Yu;

public class HelloWorld {
    
    //定义了一个方法名为 print 的方法，实现输出信息功能
    public void print() {
		System.out.println("Hello World");
	}
    
    public static void main(String[] args){
        
        //在 main 方法中调用 print 方法
        HelloWorld test=new HelloWorld();
        test.print();
        test.printOne();
    }
    public static void printOne()
    {
        System.out.println("Jin yu bao");
    }
}