package 接口实现福利彩票;

/**
 * 用一个实现类B；实现类也可以写在原类的内部
 * @author Administrator
 *
 */
 class B {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   C a=new C("金玉宝");
	       Thread t=new Thread(a);//建立线程对象
	       C a1=new C("张宽");
	       Thread t1=new Thread(a1);//建立线程对象
	       t.start();
	       t1.start();
	       t.setName("金玉宝");
	       t1.setName("张宽");
	       System.out.println("当前的线程总数为："+Thread.activeCount());
	       if(t.isAlive())
	       {
	    	   System.out.println("中断线程："+Thread.currentThread().getName());
	    	   t.interrupted();
	       }
	       if(t1.isAlive())
	       {
	    	   System.out.println("中断线程："+Thread.currentThread().getName());
	    	   t1.interrupted();
	       }     
	}
 }
 class C implements Runnable{
		private String name;
		public C(String name1)
		{
			name=name1;
		}
		public void run()
		{
			for(int i=0;i<100;i++)
			{
				int j=0;
				System.out.println(Thread.currentThread().getName()+"  "+"购买彩票:"+(int)((Math.random()*10)+1)+"号");
				System.out.flush();
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
}
 
 
