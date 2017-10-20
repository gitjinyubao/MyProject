package threadPool;

/*
 * 通过匿名内部类的方法实现多线程
 */
public class InternalClassThread {
	
	public static void main(String[] args) {
		// 继承Thred类实现多线程
	    new Thread() {
	    	public void run() {
	    		System.out.println("匿名内部类");
	    	};
	    }.start();
	    
	    // 实现Runable接口实现多线程
	    new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Runable实现");
			}
		}) {
	    }.start();
	    
	    // 经典面试
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
