package ������Ʊ;

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
			System.out.println(Thread.currentThread().getName()+"��"+"�����Ʊ:  "+(int)((Math.random()*10)+1)+"��");
			try {
				if(++i%10==0)
				{
					Thread.sleep(5000);//����5��
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		A a1=new A("����");//��һ���߳�
	    a1.start();//������һ���߳�
		A a2=new A("�ſ�");//�ڶ����߳�
		a2.start();//�����ڶ����߳�
	}
}
