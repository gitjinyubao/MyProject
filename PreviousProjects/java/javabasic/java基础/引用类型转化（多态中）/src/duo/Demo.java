package duo;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Person p=new Person();
        Children c=new Children();
        Person p=c;//(��������ת������ʽת��)//Person p=new Children();
        if(p instanceof Children ){
        	Children c1=(Children)p;//(����ת��)	
        	p.eat();
        }
        else
        {
        	System.out.println("�޷�ת��");
        }
        if(p instanceof Teenager ){
        	Teenager t=(Teenager)p;//(����ת��)	
        	p.eat();
        }
        else
        {
        	System.out.println("�޷�ת��");
        }
 
        Person p1=new Teenager();
  
        
        if(p1 instanceof Teenager ){
               Teenager t1=(Teenager)p1;//(����ת��)	
               p1.eat();
        }
        else
        {
        	System.out.println("�޷�ת��");
        }
        
	}//1.���ô��ַ���ʱ��Ӧ�����ø�������ָ�������һ�������ַ           2.���ַ��������ж��Ƿ�Ϊ����Ĺ�ϵ

}
