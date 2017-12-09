package 创建线程_启动线程_终结线程;
/**
 * 线程常用方法介绍
 * 线程的创建：Thread()
 *            Thread(String name)
 *            Thread(Runnabal  target)
 *            Thread(Runnabal target,String name)
 *线程的方法：
 *     启动：void start();
 *     休眠：static void sleep(long millis);
 *           static void sleep(long millis,int nanos);
 *    使其他的线程等待当前线程终止：
 *           void join();
 *           void join(long millis);
 *           void join(long millis,int nanos);
 *    使当前运行线程释放处理器资源：
 *           static void yield();
 *获取线程引用：
 *           static Thread currentThread();                                   
 * @author Administrator
 *
 */
public class Actor {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
