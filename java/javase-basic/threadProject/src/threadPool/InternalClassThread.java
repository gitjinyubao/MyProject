package threadPool;

/*
 * ͨ�������ڲ���ķ���ʵ�ֶ��߳�
 */
public class InternalClassThread {
	
	public static void main(String[] args) {
		// �̳�Thred��ʵ�ֶ��߳�
	    new Thread() {
	    	public void run() {
	    		System.out.println("�����ڲ���");
	    	};
	    }.start();
	    
	    // ʵ��Runable�ӿ�ʵ�ֶ��߳�
	    new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Runableʵ��");
			}
		}) {
	    }.start();
	    
	    // ��������
	    new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("hello");
			}
		}) {
	    	public void run() {
	    		System.out.println("word");
	    	};
	    }.start();
	}
}
