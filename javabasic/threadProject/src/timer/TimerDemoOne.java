package timer;

import java.util.Timer;
import java.util.TimerTask;

/*
 * ��ʱ��:������������ָ����ʱ������
 *      ����Timer��TimerTask������
 *      Timer:��ʱ
 *      TimerTask:����
 *    
 */
public class TimerDemoOne {

	public static void main(String[] args) {
		Timer t = new Timer();
        
		// �����ǲ���رյ�
		// t.schedule(new MyTimerTask(), 3000);
		
		// ����һ���ǿ��Թرյ�
		t.schedule(new MyTimerTask(t), 3000);
	}
}

// ����һ������
class MyTimerTask extends TimerTask {
	private Timer t;
	
	public MyTimerTask() {
	}
	
	public MyTimerTask(Timer t) {
		this.t = t;
	}
	
	@Override
	public void run() {
		System.out.println("��");
		
		// �������֮��Ϳ���ʵ�ֶ�ʱ���ر�
		t.cancel();
	}
}