package �ӿ�ʵ�ָ�����Ʊ;

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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A("����");
       Thread t=new Thread(a);//�����̶߳���
       A a1=new A("�ſ�");
       Thread t1=new Thread(a1);//�����̶߳���
       t.start();
       t1.start();
       
	}

}
