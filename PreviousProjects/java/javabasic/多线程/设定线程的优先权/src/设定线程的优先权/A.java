package �趨�̵߳�����Ȩ;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b1=new B();
		B b2=new B();
		B b3=new B();
		Thread t=new Thread(b1);
		Thread t1=new Thread(b2);
		Thread t2=new Thread(b2);
		t.setName("��");
	    t1.setName("��");
	    t2.setName("��");
		//System.out.println("�ܵ��߳���Ŀ��"+Thread.activeCount());
		System.out.println("main������ȨֵΪ��"+Thread.currentThread().getPriority());
		System.out.println("t������ȨֵΪ��"+t.getPriority());
		System.out.println("t1������ȨֵΪ��"+t1.getPriority());
		System.out.println("t2������ȨֵΪ��"+t2.getPriority());
		t.start();
		t1.start();
		t2.start();//ֻ��ִ�з���run()�е�
		t.setPriority(10);
		t2.setPriority(7);
		t1.setPriority(3);
		
		//�趨����Ȩֵ
		try {
			Thread.sleep(1800);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t.getName()+"ִ�У�"+b1.Counter()+"��");
		System.out.println(t1.getName()+"ִ�У�"+b2.Counter()+"��");
		System.out.println(t2.getName()+"ִ�У�"+b3.Counter()+"��");

	}
}
