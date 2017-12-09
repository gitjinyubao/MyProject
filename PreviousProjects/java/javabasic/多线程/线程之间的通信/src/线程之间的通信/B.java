package 线程之间的通信;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	A a1=new A(5);
	A a2=new A(7);
	A a3=new A(9);
//	Thread t1=new Thread(a1);
//	Thread t2=new Thread(a2);
//	Thread t3=new Thread(a3);
	a1.start();
//	try {
//		a1.join();
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	try {
//		a2.join();
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	try {
//		a3.join();
//	} catch (InterruptedException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
	}
}
