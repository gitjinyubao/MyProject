package innerClassImplThread;

/*
 * �����ڲ����ʵ�ָ�ʽ��
 *                 new �������߽ӿ���() {
 *                 } 
 *                 ���ʣ������ӿڵ��Ӷ���
 */
public class Test {
	
	public static void main(String[] args) {
		new Thread() {
			
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName());
				}
			}
		}.start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName());
				}
			}
		}){}.start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName());
				}
			}
		}){
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println(Thread.currentThread().getName());
				}
			}
		}.start();
	}
}
