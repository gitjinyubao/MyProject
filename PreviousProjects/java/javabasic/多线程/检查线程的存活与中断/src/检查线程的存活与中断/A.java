package ����̵߳Ĵ�����ж�;
public class A {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   B a=new B("����");
	       Thread t=new Thread(a);//�����̶߳���
	       B a1=new B("�ſ�");
	       Thread t1=new Thread(a1);//�����̶߳���
	       t.start();
	       t1.start();
	       t.setName("����");
	       t1.setName("�ſ�");
	       Thread.sleep(700);
	       System.out.println("�߳�������"+Thread.activeCount());
	       //�ж��̵߳Ĵ�����ж�
//	       if(t.isAlive())//�ж��Ƿ���
//	       {
//	    	   System.out.println("�жϽ��񱦹����Ʊ");
//	    	   t.interrupt();//�жϽ��񱦹����Ʊ
//	       }
//	       if(t1.isAlive())//�ж��Ƿ���
//	       {
//	    	   System.out.println("�ж��ſ����Ʊ");
//	    	   t1.interrupt();//�ж��ſ����Ʊ
//	       }
	}
}
