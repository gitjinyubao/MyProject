package �ӿ�ʵ�ָ�����Ʊ;

/**
 * ��һ��ʵ����B��ʵ����Ҳ����д��ԭ����ڲ�
 * @author Administrator
 *
 */
 class B {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   C a=new C("����");
	       Thread t=new Thread(a);//�����̶߳���
	       C a1=new C("�ſ�");
	       Thread t1=new Thread(a1);//�����̶߳���
	       t.start();
	       t1.start();
	       t.setName("����");
	       t1.setName("�ſ�");
	       System.out.println("��ǰ���߳�����Ϊ��"+Thread.activeCount());
	       if(t.isAlive())
	       {
	    	   System.out.println("�ж��̣߳�"+Thread.currentThread().getName());
	    	   t.interrupted();
	       }
	       if(t1.isAlive())
	       {
	    	   System.out.println("�ж��̣߳�"+Thread.currentThread().getName());
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
				System.out.println(Thread.currentThread().getName()+"  "+"�����Ʊ:"+(int)((Math.random()*10)+1)+"��");
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
 
 
