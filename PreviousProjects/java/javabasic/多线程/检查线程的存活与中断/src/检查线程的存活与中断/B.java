package 检查线程的存活与中断;

public class B implements Runnable{
	
		private String name;
		public B(String name1)
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
	}


