package TreadGroup;

/*
 * 线程组：把多个线程组合在一起
 *       它可以对一批线程组分类管理,java允许程序直接对线程组进行控制
 */
public class Test {
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new MyRunable(), "线程1");
		Thread t2 = new Thread(new MyRunable(), "线程2");
		
		/*
		 * 我们不知道他们是哪个线程组？该怎么办？
		 * public final ThreadGroup getThreadGroup()
		 */
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		
		// 默认情况下所有的线程都是属于同一个组
		System.out.println(tg1.getName() + ":" +tg2.getName() + ":" +Thread.currentThread().getThreadGroup().getName());
		
		System.out.println("=====================================================");
		
		/* 如何修改线程所在的组
		 * 创建一个线程组
		 * 创建其他的线程的时候，指定其线程组为已创建的那个线程组
		 */
		// 创建新的线程组
		ThreadGroup tg3 = new ThreadGroup("新的线程组");
		
		// 将线程放入线程组
		Thread t3 = new Thread(tg3, new MyRunable(), "线程3");
		Thread t4 = new Thread(tg3, new MyRunable(), "线程4");
		
		System.out.println(t3.getThreadGroup().getName() + ":" + t4.getThreadGroup().getName() + ":" +Thread.currentThread().getThreadGroup().getName());
		
		// 设置组内的所有线程都为守护线程（后台线程）：统一控制组内线程
		tg3.setDaemon(true);
	}
}
