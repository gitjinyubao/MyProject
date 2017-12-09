package 福利彩票;

public class A extends Thread {
	private String name;
    public A(String name1)
    {
    	name=name1;
    }
	public void run()
	{
		for(int i=0;i<100;++i)
		{
			System.out.println(Thread.currentThread().getName()+"　"+"购买彩票:  "+(int)((Math.random()*10)+1)+"号");
			try {
				if(++i%10==0)
				{
					Thread.sleep(5000);//休眠5秒
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		A a1=new A("金玉宝");//第一个线程
	    a1.start();//启动第一个线程
		A a2=new A("张宽");//第二个线程
		a2.start();//启动第二个线程
	}
}
