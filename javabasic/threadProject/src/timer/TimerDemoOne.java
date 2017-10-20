package timer;

import java.util.Timer;
import java.util.TimerTask;

/*
 * 定时器:可以让我们在指定的时间做事
 *      依赖Timer和TimerTask两个类
 *      Timer:定时
 *      TimerTask:任务
 *    
 */
public class TimerDemoOne {

	public static void main(String[] args) {
		Timer t = new Timer();
        
		// 这种是不会关闭的
		// t.schedule(new MyTimerTask(), 3000);
		
		// 定义一种是可以关闭的
		t.schedule(new MyTimerTask(t), 3000);
	}
}

// 定义一个任务
class MyTimerTask extends TimerTask {
	private Timer t;
	
	public MyTimerTask() {
	}
	
	public MyTimerTask(Timer t) {
		this.t = t;
	}
	
	@Override
	public void run() {
		System.out.println("崩");
		
		// 加上这个之后就可以实现定时器关闭
		t.cancel();
	}
}