package duo;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Person p=new Person();
        Children c=new Children();
        Person p=c;//(向上类型转化，隐式转化)//Person p=new Children();
        if(p instanceof Children ){
        	Children c1=(Children)p;//(向下转化)	
        	p.eat();
        }
        else
        {
        	System.out.println("无法转化");
        }
        if(p instanceof Teenager ){
        	Teenager t=(Teenager)p;//(向下转化)	
        	p.eat();
        }
        else
        {
        	System.out.println("无法转化");
        }
 
        Person p1=new Teenager();
  
        
        if(p1 instanceof Teenager ){
               Teenager t1=(Teenager)p1;//(向下转化)	
               p1.eat();
        }
        else
        {
        	System.out.println("无法转化");
        }
        
	}//1.运用此种方法时，应该先让父类引用指向子类的一个对象地址           2.此种方法用于判断是否为子类的关系

}
