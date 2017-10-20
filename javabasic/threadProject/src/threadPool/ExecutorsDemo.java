package threadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * 线程池的好处：
 * 			线程池里的每一个线程代码结束后，并不会死亡，而是再次回到线程池中，成为空闲状态，等待下一个对象使用
 */
public class ExecutorsDemo {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// 定义一个线程池
		ExecutorService pool = Executors.newFixedThreadPool(10);
		
		//可以执行Runable和Callable代表的线程
		pool.submit(new MyRunable());
		pool.submit(new MyRunable());
		
		//利用Callable实现多线程必须依靠线程池
		Future<Integer> f1 = pool.submit(new MyCallable(5));
		Future<Integer> f2 = pool.submit(new MyCallable(9));
		
		Integer sum1 = f1.get();
		Integer sum2 = f2.get();
		
		System.out.println("sum1: " + sum1 + "\n" + "sum2: " +sum2);
		
		//结束线程池
		pool.shutdown();
	}
}
