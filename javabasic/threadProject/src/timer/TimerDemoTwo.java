package timer;

import java.util.Timer;
import java.util.TimerTask;

public class TimerDemoTwo {

	public static void main(String[] args) {
		Timer t = new Timer();
		
		// �����ǲ���رյ�,����ִ������
		t.schedule(new MyTask(), 3000, 2000);
	}
}

// ����һ������
class MyTask extends TimerTask {

	@Override
	public void run() {
		System.out.println("��");
	}
}