package 单一线程;

public class main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.print("线程的名称:");
		//取得当前执行的线程名称
		System.out.println(Thread.currentThread().getName());
		//显示一个随机数
		int j=0;
		while(true)
		{
			//int i=(int)(Math.random()*99);
			System.out.print(Math.random()*99+" ");
			//每输出10个就暂停2秒
//			if(++j%10==0)
//			{
				Thread.sleep(2000);
//			}	
		}
	}
}
