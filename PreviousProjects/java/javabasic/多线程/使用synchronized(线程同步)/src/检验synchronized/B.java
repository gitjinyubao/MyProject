package ºÏ—Èsynchronized;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      A a1=new A("jin");
      A a2=new A("yu");
      A a3=new A("bao");
      Thread t1=new Thread(a1);
      Thread t2=new Thread(a2);
      Thread t3=new Thread(a3);
      t3.start();
      t1.start();
      t2.start();
	}
}
