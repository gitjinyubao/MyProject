package timer;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemoTwo {

	public static void main(String[] args) {
		Timer t = new Timer();
		
		// 这种是不会关闭的,连环执行任务
		t.schedule(new MyTask(), 3000, 2000);
	}
}

// 定义一个任务
class MyTask extends TimerTask {

	@Override
	public void run() {
		System.out.println("崩");
	}
}