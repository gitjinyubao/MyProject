package innerClassImplThread;

/*
 * 匿名内部类的实现格式：
 *                 new 类名或者接口名() {
 *                 } 
 *                 本质：该类或接口的子对象
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
