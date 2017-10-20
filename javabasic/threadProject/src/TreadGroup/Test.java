package TreadGroup;

/*
 * �߳��飺�Ѷ���߳������һ��
 *       �����Զ�һ���߳���������,java�������ֱ�Ӷ��߳�����п���
 */
public class Test {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new MyRunable(), "�߳�1");
		Thread t2 = new Thread(new MyRunable(), "�߳�2");
		
		/*
		 * ���ǲ�֪���������ĸ��߳��飿����ô�죿
		 * public final ThreadGroup getThreadGroup()
		 */
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		
		// Ĭ����������е��̶߳�������ͬһ����
		System.out.println(tg1.getName() + ":" +tg2.getName() + ":" +Thread.currentThread().getThreadGroup().getName());
		
		System.out.println("=====================================================");
		
		/* ����޸��߳����ڵ���
		 * ����һ���߳���
		 * �����������̵߳�ʱ��ָ�����߳���Ϊ�Ѵ������Ǹ��߳���
		 */
		// �����µ��߳���
		ThreadGroup tg3 = new ThreadGroup("�µ��߳���");
		
		// ���̷߳����߳���
		Thread t3 = new Thread(tg3, new MyRunable(), "�߳�3");
		Thread t4 = new Thread(tg3, new MyRunable(), "�߳�4");
		
		System.out.println(t3.getThreadGroup().getName() + ":" + t4.getThreadGroup().getName() + ":" +Thread.currentThread().getThreadGroup().getName());
		
		// �������ڵ������̶߳�Ϊ�ػ��̣߳���̨�̣߳���ͳһ���������߳�
		tg3.setDaemon(true);
	}
}
