package �Ŷ�ͬ������;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1=new A("��");
		A a2=new A("��");
		A a3=new A("��");
		Thread t1=new Thread(a1);
		Thread t2=new Thread(a2);
		Thread t3=new Thread(a3);
		t1.start();
		System.out.println("�߳�������"+Thread.activeCount());
		t2.start();//��ʱt1����ִ�У�t2�Ѿ��������������״̬���������仹δ����ִ��
		System.out.println("�߳�������"+Thread.activeCount());
		t3.start();
		System.out.println("�߳�������"+Thread.activeCount());
	}
}
