package 接口实现福利彩票;

public class A implements Runnable{
	private String name;
	public A(String name1)
	{
		name=name1;
	}
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			int j=0;
			System.out.println(Thread.currentThread().getName()+"  "+"购买彩票:"+(int)((Math.random()*10)+1)+"号");
			if((++j)%10==0)
			{
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A("金玉宝");
       Thread t=new Thread(a);//建立线程对象
       A a1=new A("张宽");
       Thread t1=new Thread(a1);//建立线程对象
       t.start();
       t1.start();
       
	}

}
