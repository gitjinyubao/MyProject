package ����̵߳Ĵ�����ж�;

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
				System.out.println(Thread.currentThread().getName()+"  "+"�����Ʊ:"+(int)((Math.random()*10)+1)+"��");
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


