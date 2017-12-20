package threadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * �̳߳صĺô���
 * 			�̳߳����ÿһ���̴߳�������󣬲����������������ٴλص��̳߳��У���Ϊ����״̬���ȴ���һ������ʹ��
 */
public class ExecutorsDemo {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// ����һ���̳߳�
		ExecutorService pool = Executors.newFixedThreadPool(10);
		
		//����ִ��Runable��Callable������߳�
		pool.submit(new MyRunable());
		pool.submit(new MyRunable());
		
		//����Callableʵ�ֶ��̱߳��������̳߳�
		Future<Integer> f1 = pool.submit(new MyCallable(5));
		Future<Integer> f2 = pool.submit(new MyCallable(9));
		
		Integer sum1 = f1.get();
		Integer sum2 = f2.get();
		
		System.out.println("sum1: " + sum1 + "\n" + "sum2: " +sum2);
		
		//�����̳߳�
		pool.shutdown();
	}
}
